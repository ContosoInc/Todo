using System;
using GitWallet.Credentials;
using GitWallet.Credentials.Basic;
using GitWallet.Credentials.Vso;
using GitWallet.Storage;
using GitWallet.UI;
using GitWallet.UI.Wpf;

namespace GitWallet
{
    /// <summary>
    /// Implements the main entry point of the application.
    /// </summary>
    public class Program
    {
        // Constants
        private const int c_success = 0;
        private const int c_failure = -1;

        /// <summary>
        /// Main entry point of the application.
        /// </summary>
        /// <param name="args"></param>
        /// <returns></returns>
        [STAThread]
        public static int Main(string[] args)
        {
            Logger logger = null;
            Arguments arguments;
            UIProvider uiProvider;
            StorageProvider storageProvider;
            CredentialProviderGroup[] credentialProviderGroups;

            // Create component implementations
            try
            {
                logger = new Logger();
                arguments = new Arguments(args);
                uiProvider = new WpfUIProvider();
                storageProvider = new WindowsCredentialManagerStorageProvider();
                credentialProviderGroups = new CredentialProviderGroup[]
                    {
                        new BasicCredentialProviderGroup(),
                        new VsoCredentialProviderGroup()
                    };
            }
            catch (Exception ex)
            {
                if (logger == null)
                {
                    Console.WriteLine(ex.Message);
                }
                else
                {
                    logger.Log(ex);
                }
                return c_failure;
            }

            // Install if required
            try
            {
                if (arguments.ShouldInstall)
                {
                    Installer installer = new Installer(uiProvider);
                    installer.Install();
                    return c_success;
                }
            }
            catch (Exception ex)
            {
                logger.Log(ex);
                return c_failure;
            }

            // Run
            Program program = new Program();
            int result = program.Run(arguments, logger, uiProvider, storageProvider, credentialProviderGroups);
            return result;
        }

        /// <summary>
        /// Runs the application.
        /// </summary>
        /// <param name="arguments"></param>
        /// <param name="logger"></param>
        /// <param name="uiProvider"></param>
        /// <param name="storageProvider"></param>
        /// <param name="credentialProviderGroups"></param>
        /// <returns></returns>
        internal int Run(
            Arguments arguments,
            Logger logger,
            UIProvider uiProvider,
            StorageProvider storageProvider,
            CredentialProviderGroup[] credentialProviderGroups)
        {
            try
            {
                GitWallet gitWallet = new GitWallet(uiProvider, storageProvider, credentialProviderGroups);
                gitWallet.Run(arguments);
            }
            catch (Exception ex)
            {
                logger.Log(ex);
                return c_failure;
            }

            // Return success
            return c_success;
        }
    }
}
