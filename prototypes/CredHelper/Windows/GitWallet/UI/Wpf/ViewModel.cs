using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.ComponentModel;
using System.Diagnostics;
using System.Linq.Expressions;
using System.Reflection;
using System.Windows;

namespace GitWallet.UI.Wpf
{
    /// <summary>
	/// Base class for view models.
	/// </summary>
	public abstract class ViewModel : DependencyObject, INotifyPropertyChanged
    {
        // Fields
        private bool _verifyUIThread;
        private event PropertyChangedEventHandler _propertyChangedEvent;


        /// <summary>
        /// Constructor
        /// </summary>
        public ViewModel()
        {
            _verifyUIThread = true;
        }


        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="verifyUIThread"></param>
        public ViewModel(bool verifyUIThread)
        {
            _verifyUIThread = verifyUIThread;
        }


        /// <summary>
        /// Occurs when a property of the model changes.
        /// </summary>
        public event PropertyChangedEventHandler PropertyChanged
        {
            add
            {
                VerifyCalledOnUIThread();
                _propertyChangedEvent += value;
            }
            remove
            {
                VerifyCalledOnUIThread();
                _propertyChangedEvent -= value;
            }
        }


        /// <summary>
        /// Creates a new observable collection from the contents of the specified list.
        /// </summary>
        /// <typeparam name="T"></typeparam>
        /// <param name="list"></param>
        /// <returns></returns>
        public ObservableCollection<T> CreateObservableCollection<T>(IList<T> list)
        {
            // Locals
            ObservableCollection<T> observableCollection;

            // Convert list to observable collection
            observableCollection = new ObservableCollection<T>();
            foreach (T t in list)
            {
                observableCollection.Add(t);
            }

            // Return observable collection
            return observableCollection;
        }


        /// <summary>
        /// Fires the PropertyChanged event for the specified property name. 
        /// </summary>
        /// <param name="propertyName"></param>
        protected void FirePropertyChanged(string propertyName)
        {
            VerifyCalledOnUIThread();
            if (_propertyChangedEvent != null)
            {
                _propertyChangedEvent(this, new PropertyChangedEventArgs(propertyName));
            }
        }


        /// <summary>
        /// Fires the PropertyChanged event for the specified property expression (() => this.MyProperty).
        /// </summary>
        /// <typeparam name="T"></typeparam>
        /// <param name="propertyExpresssion"></param>
        protected void FirePropertyChanged<T>(Expression<Func<T>> propertyExpression)
        {
            string propertyName = ExtractPropertyName(propertyExpression);
            this.FirePropertyChanged(propertyName);
        }


        /// <summary>
        /// Extracts the property name from the specified property expression (() => this.MyProperty).
        /// </summary>
        /// <typeparam name="T"></typeparam>
        /// <param name="propertyExpression"></param>
        /// <returns></returns>
        private string ExtractPropertyName<T>(Expression<Func<T>> propertyExpression)
        {
            // Locals
            MethodInfo getMethod;
            PropertyInfo property;
            MemberExpression memberExpression;

            // Validate
            if (propertyExpression == null)
            {
                throw new ArgumentNullException("propertyExpression");
            }

            // Get member
            memberExpression = propertyExpression.Body as MemberExpression;
            if (memberExpression == null)
            {
                throw new ArgumentException("The expression is not a member access expression.", "propertyExpression");
            }

            // Get property
            property = memberExpression.Member as PropertyInfo;
            if (property == null)
            {
                throw new ArgumentException("The member access expression does not access a property.", "propertyExpression");
            }
            if (property.DeclaringType.IsAssignableFrom(this.GetType()) == false)
            {
                throw new ArgumentException("The referenced property belongs to a different type.", "propertyExpression");
            }

            // Get 'get' accessor
            getMethod = property.GetGetMethod(true);
            if (getMethod == null)
            {
                // This shouldn't happen. The expression would reject the property before reaching this far.
                throw new ArgumentException("The referenced property does not have a get method.", "propertyExpression");
            }
            if (getMethod.IsStatic == true)
            {
                throw new ArgumentException("The referenced property is a static property.", "propertyExpression");
            }

            // Return property name
            return memberExpression.Member.Name;
        }


        /// <summary>
        /// Verifies that the current thread is the UI thread.
        /// </summary>
        [Conditional("Debug")]
        protected void VerifyCalledOnUIThread()
        {
            if (_verifyUIThread == true)
            {
                Debug.Assert(this.Dispatcher.CheckAccess() == true, "Call must be made on UI thread.");
                //DebugEx.AssertWithMessageBox(this.Dispatcher.CheckAccess() == true, "Call must be made on UI thread.");
            }
        }
    }
}
