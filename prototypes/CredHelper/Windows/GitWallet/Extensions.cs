using System.Collections.Generic;

namespace GitWallet
{
    /// <summary>
    /// Container of extension methods of the application.
    /// </summary>
    static class Extensions
    {
        /// <summary>
        /// Gets the value of the specified key if it exists;
        /// otherwise the specified default value is returned.
        /// </summary>
        /// <typeparam name="TKey"></typeparam>
        /// <typeparam name="TValue"></typeparam>
        /// <param name="parameters"></param>
        /// <param name="key"></param>
        /// <param name="defaultValue"></param>
        /// <returns></returns>
        public static TValue GetOrUseDefault<TKey, TValue>(
            this IDictionary<TKey, TValue> parameters,
            TKey key,
            TValue defaultValue)
        {
            TValue val;
            if (!parameters.TryGetValue(key, out val))
            {
                val = defaultValue;
            }

            return val;
        }
    }
}
