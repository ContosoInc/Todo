using System;
using System.Diagnostics;
using System.IO;
using System.Reflection;
using GitWallet.UI;

namespace GitWallet
{
    /// <summary>
    /// Implements installation functionality.
    /// </summary>
    internal class Installer
    {
        // Instance fields
        private UIProvider m_uiProvider;

        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="uiProvider"></param>
        public Installer(UIProvider uiProvider)
        {
            if (uiProvider == null)
            {
                throw new ArgumentNullException("uiProvider");
            }

            m_uiProvider = uiProvider;
        }

        /// <summary>
        /// Installs this application.
        /// </summary>
        public void Install()
        {
            if (!m_uiProvider.IsInstallPermitted())
            {
                return;
            }

            string appDataDirectory = Environment.ExpandEnvironmentVariables(@"%AppData%\GitWallet");
            if (!Directory.Exists(appDataDirectory))
            {
                Directory.CreateDirectory(appDataDirectory);
            }

            string destinationFile = Path.Combine(appDataDirectory, "git-wallet.exe");
            File.Copy(Assembly.GetExecutingAssembly().Location, destinationFile, overwrite: true);

            Process.Start("git", "config --global credential.helper !~/AppData/Roaming/GitWallet/git-wallet");
        }
    }
}
