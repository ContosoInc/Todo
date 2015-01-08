using System.Windows;

namespace GitWallet.UI.Wpf
{
    /// <summary>
    /// Implements UI functionality using Windows Presentation Foundation (WPF).
    /// </summary>
    internal class WpfUIProvider : UIProvider
    {
        /// <summary>
        /// Gets whether install is permitted by the user.
        /// </summary>
        /// <returns></returns>
        public override bool IsInstallPermitted()
        {
            MessageBoxResult result = MessageBox.Show(
                Resources.Installer_PromptToInstall_Message,
                Resources.Installer_PromptToInstall_Caption,
                MessageBoxButton.YesNo,
                MessageBoxImage.Question);

            return result == MessageBoxResult.Yes;
        }

        /// <summary>
        /// Prompts the user for new credentials.
        /// </summary>
        /// <param name="arguments"></param>
        /// <returns></returns>
        public override CredentialResults PromptForCredentials(Arguments arguments)
        {
            CredentialsPromptView credentialsPromptView = new CredentialsPromptView();
            credentialsPromptView.ShowDialog();

            CredentialsPromptViewModel viewModel = credentialsPromptView.ViewModel;
            if (credentialsPromptView.ViewModel.IsCancelled == true)
            {
                return null;
            }
            else
            {
                return new CredentialResults(
                    credentialsPromptView.ViewModel.Username,
                    credentialsPromptView.ViewModel.Password);
            }
        }
    }
}
