using System;
using System.ComponentModel;
using System.Runtime.InteropServices;
using System.Text;
using ComTypes = System.Runtime.InteropServices.ComTypes;

namespace GitWallet.Storage
{
    /// <summary>
    /// Implements storage functionality using Windows Credential Manager.
    /// </summary>
    internal class WindowsCredentialManagerStorageProvider : StorageProvider
    {
        // Constants
        private const int c_flagsNone = 0;
        private const string c_parameterUsername = "username";
        private const string c_parameterPassword = "password";
        private const string c_credentialTargetPrefix = "git:";

        /// <summary>
        /// Gets credentials from storage.
        /// </summary>
        /// <param name="arguments"></param>
        /// <returns></returns>
        public override CredentialResults Get(Arguments arguments)
        {
            // Initialize
            Uri url = GetUrl(arguments);
            IntPtr credPtr = IntPtr.Zero;
            string credTarget = GetCredentialsTarget(url);

            try
            {
                // Attempt to read credential from Windows Credential Manager
                CredentialResults credentialResults;
                if (!CredRead(credTarget, CRED_TYPE.GENERIC, c_flagsNone, out credPtr))
                {
                    credPtr = IntPtr.Zero;
                    credentialResults = null;
                }
                else
                {
                    CREDENTIAL cred = (CREDENTIAL)Marshal.PtrToStructure(credPtr, typeof(CREDENTIAL));
                    string username = cred.userName;
                    string password = Marshal.PtrToStringBSTR(cred.credentialBlob);
                    credentialResults = new CredentialResults(username, password);
                }

                // Return results
                return credentialResults;
            }
            finally
            {
                if (credPtr != IntPtr.Zero)
                {
                    CredFree(credPtr);
                }
            }
        }

        /// <summary>
        /// Erases credentials from storage.
        /// </summary>
        /// <param name="arguments"></param>
        public override void Erase(Arguments arguments)
        {
            // Initialize
            Uri url = GetUrl(arguments);
            string credTarget = GetCredentialsTarget(url);

            // Attempt to delete the credential from Windows Credential Manager
            if (!CredDelete(credTarget, CRED_TYPE.GENERIC, c_flagsNone))
            {
                throw new Win32Exception(Marshal.GetLastWin32Error());
            }
        }

        /// <summary>
        /// Stores credentials.
        /// </summary>
        /// <param name="arguments"></param>
        public override void Store(Arguments arguments)
        {
            // Initialize
            Uri url = GetUrl(arguments);
            string credTarget = GetCredentialsTarget(url);
            string username = arguments.Parameters.GetOrUseDefault(c_parameterUsername, null);
            string password = arguments.Parameters.GetOrUseDefault(c_parameterPassword, null);

            if (string.IsNullOrEmpty(username))
            {
                throw new ArgumentException(Resources.WindowsCredStorage_MissingUsername);
            }
            if (string.IsNullOrEmpty(password))
            {
                throw new ArgumentException(Resources.WindowsCredStorage_MissingPassword);
            }

            CREDENTIAL cred = new CREDENTIAL()
            {
                attributeCount = 0,
                comment = null,
                credAttribute = IntPtr.Zero,
                credentialBlob = Marshal.StringToCoTaskMemUni(password),
                credentialBlobSize = Encoding.Unicode.GetByteCount(password),
                flags = c_flagsNone,
                lastWritten = default(ComTypes.FILETIME),
                persist = (int)CRED_PERSIST.ENTERPRISE_ROAMABLE,
                targetAlias = null,
                targetName = credTarget,
                type = (int)CRED_TYPE.GENERIC,
                userName = username
            };

            if (!CredWrite(ref cred, c_flagsNone))
            {
                throw new Win32Exception(Marshal.GetLastWin32Error());
            }
        }

        #region Private Methods
        /// <summary>
        /// Gets the URL provided by Git in the specified arguments.
        /// </summary>
        /// <param name="arguments"></param>
        /// <returns></returns>
        private static Uri GetUrl(Arguments arguments)
        {
            Uri url = new UriBuilder()
            {
                Scheme = arguments.Parameters.GetOrUseDefault("protocol", "https"),
                Host = arguments.Parameters.GetOrUseDefault("host", "no-host.git"),
                Path = arguments.Parameters.GetOrUseDefault("path", "/")
            }.Uri;
            return url;
        }

        /// <summary>
        /// Gets the Windows Credential Manager target for the specified URL.
        /// </summary>
        /// <param name="url"></param>
        /// <returns></returns>
        private static string GetCredentialsTarget(Uri url)
        {
            string credTarget = c_credentialTargetPrefix + url.AbsoluteUri;
            return credTarget;
        }
        #endregion Private Methods

        #region Native Interoperability
        [DllImport("advapi32.dll", EntryPoint = "CredDeleteW", CharSet = CharSet.Unicode)]
        private static extern bool CredDelete(string target, CRED_TYPE type, int flags);

        [DllImport("advapi32.dll")]
        private static extern void CredFree(IntPtr credentialPtr);

        [DllImport("advapi32.dll", EntryPoint = "CredReadW", CharSet = CharSet.Unicode, SetLastError = true)]
        private static extern bool CredRead(string target, CRED_TYPE type, int reservedFlag, out IntPtr credentialPtr);

        [DllImport("Advapi32.dll", SetLastError = true, EntryPoint = "CredWriteW", CharSet = CharSet.Unicode)]
        private static extern bool CredWrite(ref CREDENTIAL userCredential, UInt32 flags);

        private enum CRED_PERSIST : int
        {
            SESSION = 1,
            LOCAL_MACHINE = 2,
            ENTERPRISE_ROAMABLE = 3
        }

        private enum CRED_TYPE : int
        {
            GENERIC = 1,
            DOMAIN_PASSWORD = 2,
            DOMAIN_CERTIFICATE = 3,
            DOMAIN_VISIBLE_PASSWORD = 4,
            MAXIMUM = 5
        }

        [StructLayout(LayoutKind.Sequential, CharSet = CharSet.Unicode)]
        private struct CREDENTIAL
        {
            public int flags;
            public int type;
            [MarshalAs(UnmanagedType.LPWStr)]
            public string targetName;
            [MarshalAs(UnmanagedType.LPWStr)]
            public string comment;
            public System.Runtime.InteropServices.ComTypes.FILETIME lastWritten;
            public int credentialBlobSize;
            public IntPtr credentialBlob;
            public int persist;
            public int attributeCount;
            public IntPtr credAttribute;
            [MarshalAs(UnmanagedType.LPWStr)]
            public string targetAlias;
            [MarshalAs(UnmanagedType.LPWStr)]
            public string userName;
        }

        private enum CredUIReturnCodes : int
        {
            NO_ERROR = 0,
            ERROR_CANCELLED = 1223,
            ERROR_NO_SUCH_LOGON_SESSION = 1312,
            ERROR_NOT_FOUND = 1168,
            ERROR_INVALID_ACCOUNT_NAME = 1315,
            ERROR_INSUFFICIENT_BUFFER = 122,
            ERROR_INVALID_PARAMETER = 87,
            ERROR_INVALID_FLAGS = 1004
        }

        private enum PromptForWindowsCredentialsFlags
        {
            /// <summary>
            /// The caller is requesting that the credential provider return the user name and password in plain text.
            /// This value cannot be combined with SECURE_PROMPT.
            /// </summary>
            CREDUIWIN_GENERIC = 0x1,
            /// <summary>
            /// The Save check box is displayed in the dialog box.
            /// </summary>
            CREDUIWIN_CHECKBOX = 0x2,
            /// <summary>
            /// Only credential providers that support the authentication package specified by the authPackage parameter should be enumerated.
            /// This value cannot be combined with CREDUIWIN_IN_CRED_ONLY.
            /// </summary>
            CREDUIWIN_AUTHPACKAGE_ONLY = 0x10,
            /// <summary>
            /// Only the credentials specified by the InAuthBuffer parameter for the authentication package specified by the authPackage parameter should be enumerated.
            /// If this flag is set, and the InAuthBuffer parameter is NULL, the function fails.
            /// This value cannot be combined with CREDUIWIN_AUTHPACKAGE_ONLY.
            /// </summary>
            CREDUIWIN_IN_CRED_ONLY = 0x20,
            /// <summary>
            /// Credential providers should enumerate only administrators. This value is intended for User Account Control (UAC) purposes only. We recommend that external callers not set this flag.
            /// </summary>
            CREDUIWIN_ENUMERATE_ADMINS = 0x100,
            /// <summary>
            /// Only the incoming credentials for the authentication package specified by the authPackage parameter should be enumerated.
            /// </summary>
            CREDUIWIN_ENUMERATE_CURRENT_USER = 0x200,
            /// <summary>
            /// The credential dialog box should be displayed on the secure desktop. This value cannot be combined with CREDUIWIN_GENERIC.
            /// Windows Vista: This value is not supported until Windows Vista with SP1.
            /// </summary>
            CREDUIWIN_SECURE_PROMPT = 0x1000,
            /// <summary>
            /// The credential provider should align the credential BLOB pointed to by the refOutAuthBuffer parameter to a 32-bit boundary, even if the provider is running on a 64-bit system.
            /// </summary>
            CREDUIWIN_PACK_32_WOW = 0x10000000,
        }
        #endregion Native Interoperability
    }
}
