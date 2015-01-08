namespace GitWallet.Storage
{
    /// <summary>
    /// Defines storage functionality for the application.
    /// </summary>
    internal abstract class StorageProvider
    {
        /// <summary>
        /// Gets credentials from storage.
        /// </summary>
        /// <param name="arguments"></param>
        /// <returns></returns>
        public abstract CredentialResults Get(Arguments arguments);

        /// <summary>
        /// Erases credentials from storage.
        /// </summary>
        /// <param name="arguments"></param>
        public abstract void Erase(Arguments arguments);

        /// <summary>
        /// Stores credentials.
        /// </summary>
        /// <param name="arguments"></param>
        public abstract void Store(Arguments arguments);
    }
}
