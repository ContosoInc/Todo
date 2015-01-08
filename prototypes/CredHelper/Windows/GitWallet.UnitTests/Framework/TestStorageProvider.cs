using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using GitWallet.Storage;

namespace GitWallet.UnitTests.Framework
{
    internal class TestStorageProvider : StorageProvider
    {
        public override void Erase(Arguments arguments)
        {
        }

        public override CredentialResults Get(Arguments arguments)
        {
            return null;
        }

        public override void Store(Arguments arguments)
        {
        }
    }
}
