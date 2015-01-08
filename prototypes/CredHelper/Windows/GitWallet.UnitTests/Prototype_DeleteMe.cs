using GitWallet.Credentials;
using GitWallet.Credentials.Basic;
using GitWallet.Credentials.Vso;
using GitWallet.Storage;
using GitWallet.UI;
using GitWallet.UnitTests.Framework;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace GitWallet.UnitTests
{
    [TestClass]
    public class Prototype_DeleteMe
    {
        [TestMethod]
        public void TestMethod1()
        {
            Logger logger;
            Arguments arguments;
            UIProvider uiProvider;
            StorageProvider storageProvider;
            CredentialProviderGroup[] credentialProviderGroups;

            logger = new Logger();
            arguments = new Arguments(CredentialHelperCommand.Get);
            uiProvider = new TestUIProvider();
            storageProvider = new TestStorageProvider();
            credentialProviderGroups = new CredentialProviderGroup[]
                {
                        new BasicCredentialProviderGroup(),
                        new VsoCredentialProviderGroup()
                };

            Program program = new Program();
            int result = program.Run(arguments, logger, uiProvider, storageProvider, credentialProviderGroups);

            Assert.AreEqual(0, result);
        }
    }
}
