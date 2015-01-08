namespace GitWallet.UI.Wpf
{
    /// <summary>
    /// Implements a view model for prompting for credentials.
    /// </summary>
    internal class CredentialsPromptViewModel : ViewModel
    {
        // Instance fields
        private string m_username;
        private string m_password;

        /// <summary>
        /// Gets whether the credential prompt was cancelled.
        /// </summary>
        public bool IsCancelled { get; private set; }

        /// <summary>
        /// Gets or sets the username.
        /// </summary>
        public string Username
        {
            get { return m_username; }
            set
            {
                m_username = value;
                FirePropertyChanged("Username");
            }
        }

        /// <summary>
        /// Gets or sets the password.
        /// </summary>
        public string Password
        {
            get { return m_password; }
            set
            {
                m_password = value;
                FirePropertyChanged("Password");
            }
        }

        /// <summary>
        /// Saves the credentials that were provided.
        /// </summary>
        public void Save()
        {
            IsCancelled = false;
        }

        /// <summary>
        /// Cancels the prompt for credentials.
        /// </summary>
        public void Cancel()
        {
            Username = null;
            Password = null;
            IsCancelled = true;
        }
    }
}
