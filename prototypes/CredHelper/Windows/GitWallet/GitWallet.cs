using System;
using System.Collections.Generic;
using System.Linq;
using GitWallet.Credentials;
using GitWallet.Storage;
using GitWallet.UI;

namespace GitWallet
{
    /// <summary>
    /// Implements core Git credential helper functionality.
    /// </summary>
    internal class GitWallet
    {
        // Constants
        private const int c_windowsXPMajorVersion = 5;

        // Instance fields
        private UIProvider m_uiProvider;
        private StorageProvider m_storageProvider;
        private IEnumerable<CredentialProviderGroup> m_credentialProviderGroups;

        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="uiProvider"></param>
        /// <param name="storageProvider"></param>
        /// <param name="credentialProviderGroups"></param>
        public GitWallet(
            UIProvider uiProvider,
            StorageProvider storageProvider,
            IEnumerable<CredentialProviderGroup> credentialProviderGroups)
        {
            if (uiProvider == null)
            {
                throw new ArgumentNullException("uiProvider");
            }

            if (storageProvider == null)
            {
                throw new ArgumentNullException("storageProvider");
            }

            if (credentialProviderGroups == null)
            {
                throw new ArgumentNullException("authenticationGroups");
            }

            if (!credentialProviderGroups.Any())
            {
                throw new ArgumentException("authenticationGroups");
            }

            m_uiProvider = uiProvider;
            m_storageProvider = storageProvider;
            m_credentialProviderGroups = credentialProviderGroups;
        }

        /// <summary>
        /// Runs the Git credential helper command indicated by the specified arguments.
        /// </summary>
        /// <param name="arguments"></param>
        public void Run(Arguments arguments)
        {
            if (arguments == null)
            {
                throw new ArgumentNullException("arguments");
            }

            if (arguments.Command == CredentialHelperCommand.None)
            {
                throw new InvalidOperationException("arguments.Command");
            }

            CredentialResults credentialResults = null;
            switch (arguments.Command)
            {
                case CredentialHelperCommand.Get:
                    {
                        credentialResults = m_storageProvider.Get(arguments);
                        if (credentialResults == null)
                        {
                            // Under Windows XP, force credentials to be entered by Git's command line prompt
                            if (!IsRunningWindowsXP())
                            {
                                credentialResults = m_uiProvider.PromptForCredentials(arguments);
                            }
                        }
                        break;
                    }
                case CredentialHelperCommand.Erase:
                    {
                        m_storageProvider.Erase(arguments);
                        break;
                    }
                case CredentialHelperCommand.Store:
                    {
                        m_storageProvider.Store(arguments);
                        break;
                    }
                default:
                    {
                        throw new InvalidOperationException(arguments.Command.ToString());
                    }
            }

            if (credentialResults != null)
            {
                Console.Write("{0}={1}\n",
                    credentialResults.Username,
                    credentialResults.Password);
            }
        }

        #region Private Methods
        /// <summary>
        /// Gets whether the running OS is Windows XP.
        /// </summary>
        /// <returns></returns>
        private bool IsRunningWindowsXP()
        {
            return Environment.OSVersion.Version.Major == c_windowsXPMajorVersion;
        }
        #endregion Private Methods
    }
}
