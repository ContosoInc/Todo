namespace GitWallet
{
    /// <summary>
    /// Enumerates the supported Git credential helper commands.
    /// </summary>
    internal enum CredentialHelperCommand
    {
        None = 0,
        Get = 1,
        Store = 2,
        Erase = 3
    }
}