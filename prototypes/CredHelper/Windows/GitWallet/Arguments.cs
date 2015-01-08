using System;
using System.Collections.Generic;
using System.Diagnostics;

namespace GitWallet
{
    /// <summary>
    /// Implements parsing of command line arguments passed to this application.
    /// </summary>
    internal class Arguments
    {
        // Constants
        internal const string GetCommand = "get";
        internal const string DebugCommand = "debug";
        internal const string EraseCommand = "erase";
        internal const string StoreCommand = "store";
        internal const string IgnoreStdinParametersCommand = "ignoreStdinParameters";

        // Static fields
        private static readonly char[] s_paramKeyValueDelimiter = new char[] { '=' };

        // Instance fields
        private bool m_ignoreStdinParameters;
        private Dictionary<string, string> m_parameters;

        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="args"></param>
        public Arguments(string[] args)
        {
            Parse(args);
        }

        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="command"></param>
        /// <param name="parameters"></param>
        internal Arguments(
            CredentialHelperCommand command,
            IDictionary<string, string> parameters = null)
        {
            Command = command;
            m_parameters = parameters == null ?
                new Dictionary<string, string>() :
                new Dictionary<string, string>(parameters);
        }

        /// <summary>
        /// Gets the command to execute.
        /// </summary>
        public CredentialHelperCommand Command { get; internal set; }

        /// <summary>
        /// Gets whether an installation of this application is required.
        /// </summary>
        public bool ShouldInstall
        {
            get { return Command == CredentialHelperCommand.None; }
        }

        /// <summary>
        /// Gets parameters that were provided by Git.
        /// </summary>
        public IDictionary<string, string> Parameters
        {
            get { return m_parameters; }
            internal set { m_parameters = new Dictionary<string, string>(value); }
        }

        /// <summary>
        /// Parses the specified command line arguments.
        /// </summary>
        /// <param name="args"></param>
        private void Parse(string[] args)
        {
            Command = CredentialHelperCommand.None;
            m_parameters = new Dictionary<string, string>();

            if (args.Length == 0)
            {
                return;
            }

            int argIndex = 0;

            if (args[argIndex].Equals(DebugCommand, StringComparison.OrdinalIgnoreCase))
            {
                argIndex++;
                Debugger.Launch();
            }

            if (args[argIndex].Equals(IgnoreStdinParametersCommand, StringComparison.OrdinalIgnoreCase))
            {
                argIndex++;
                m_ignoreStdinParameters = true;
            }

            if (args[argIndex].Equals(EraseCommand, StringComparison.OrdinalIgnoreCase))
            {
                Command = CredentialHelperCommand.Erase;
            }
            else if (args[argIndex].Equals(GetCommand, StringComparison.OrdinalIgnoreCase))
            {
                Command = CredentialHelperCommand.Get;
            }
            else if (args[argIndex].Equals(StoreCommand, StringComparison.OrdinalIgnoreCase))
            {
                Command = CredentialHelperCommand.Store;
            }
            else
            {
                WriteUsage();
                return;
            }

            string line;
            while (!m_ignoreStdinParameters &&
                !string.IsNullOrWhiteSpace((line = Console.ReadLine())))
            {
                string[] splitLine = line.Split(s_paramKeyValueDelimiter);
                m_parameters[splitLine[0].Trim()] = splitLine[1].Trim();
            }
        }

        /// <summary>
        /// Writes usage information to the console.
        /// </summary>
        private void WriteUsage()
        {
            Console.WriteLine("TODO: Write usage here.");
        }
    }
}
