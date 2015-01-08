using System;

namespace GitWallet.UI
{
    /// <summary>
    /// Defines UI functionality for the application.
    /// </summary>
    internal abstract class UIProvider
    {
        /// <summary>
        /// Gets whether install is permitted by the user.
        /// </summary>
        /// <returns></returns>
        public abstract bool IsInstallPermitted();

        /// <summary>
        /// Prompts the user for new credentials.
        /// </summary>
        /// <param name="arguments"></param>
        /// <returns></returns>
        public abstract CredentialResults PromptForCredentials(Arguments arguments);
    }
}
