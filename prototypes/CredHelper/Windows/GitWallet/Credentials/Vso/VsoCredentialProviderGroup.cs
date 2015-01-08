using System.Collections.Generic;

namespace GitWallet.Credentials.Vso
{
    /// <summary>
    /// Implements a group of credential providers for Visual Studio Online.
    /// </summary>
    internal class VsoCredentialProviderGroup : CredentialProviderGroup
    {
        /// <summary>
        /// Gets the list of credential providers belonging to this group.
        /// </summary>
        public override List<CredentialProvider> CredentialProviders
        {
            get { return new List<CredentialProvider>() { new OAuth2CredentialProvider(), new TokenCredentialProvider() }; }
        }
    }
}
