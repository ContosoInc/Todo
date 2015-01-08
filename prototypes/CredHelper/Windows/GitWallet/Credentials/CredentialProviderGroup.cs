using System.Collections.Generic;

namespace GitWallet.Credentials
{
    /// <summary>
    /// Defines a group of related credential providers.
    /// </summary>
    internal abstract class CredentialProviderGroup
    {
        /// <summary>
        /// Gets the list of credential providers belonging to this group.
        /// </summary>
        public abstract List<CredentialProvider> CredentialProviders { get; }
    }
}
