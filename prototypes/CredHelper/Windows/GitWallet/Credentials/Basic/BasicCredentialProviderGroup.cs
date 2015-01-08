using System.Collections.Generic;

namespace GitWallet.Credentials.Basic
{
    /// <summary>
    /// Implements a group of credential providers that are basic and reusable.
    /// </summary>
    internal class BasicCredentialProviderGroup : CredentialProviderGroup
    {
        /// <summary>
        /// Gets the list of credential providers belonging to this group.
        /// </summary>
        public override List<CredentialProvider> CredentialProviders
        {
            get { return new List<CredentialProvider>() { new BasicAuthCredentialProvider() }; }
        }
    }
}
