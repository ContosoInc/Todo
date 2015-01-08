using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using GitWallet.UI;

namespace GitWallet.UnitTests.Framework
{
    internal class TestUIProvider : UIProvider
    {
        public override bool IsInstallPermitted()
        {
            return true;
        }

        public override CredentialResults PromptForCredentials(Arguments arguments)
        {
            return new CredentialResults("myUsername", "myPassword");
        }
    }
}
