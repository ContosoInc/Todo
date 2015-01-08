using System;

namespace GitWallet
{
    /// <summary>
    /// Implements logging functionality.
    /// </summary>
    internal class Logger
    {
        internal void Log(Exception ex)
        {
            Console.WriteLine(ex.Message);
        }
    }
}
