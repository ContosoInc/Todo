namespace GitWallet
{
    /// <summary>
    /// Encapsulates credential helper results to be provided to Git.
    /// </summary>
    internal class CredentialResults
    {
        // Instance fields
        private string m_username;
        private string m_password;

        /// <summary>
        /// Constructor
        /// </summary>
        public CredentialResults()
        {
        }

        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="username"></param>
        /// <param name="password"></param>
        internal CredentialResults(string username, string password)
        {
            m_username = username;
            Password = password;
        }

        /// <summary>
        /// Gets or sets the username.
        /// </summary>
        public string Username
        {
            get { return m_username; }
            set { m_username = value; }
        }

        /// <summary>
        /// Gets or sets the password.
        /// </summary>
        public string Password
        {
            get { return m_password; }
            set { m_password = value; }
        }
    }
}