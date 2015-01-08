using System.Windows;

namespace GitWallet.UI.Wpf
{
    /// <summary>
    /// Interaction logic for CredentialsPromptView.xaml
    /// </summary>
    public partial class CredentialsPromptView : Window
    {
        // Instance fields
        private CredentialsPromptViewModel m_viewModel;

        /// <summary>
        /// Constructor
        /// </summary>
        public CredentialsPromptView()
        {
            InitializeComponent();
            m_viewModel = new CredentialsPromptViewModel();
            DataContext = m_viewModel;
        }

        /// <summary>
        /// Gets the view model instance.
        /// </summary>
        internal CredentialsPromptViewModel ViewModel
        {
            get { return m_viewModel; }
        }

        private void OKButton_Click(object sender, RoutedEventArgs e)
        {
            m_viewModel.Password = passwordPB.Password;
            m_viewModel.Save();
            Close();
        }

        private void CancelButton_Click(object sender, RoutedEventArgs e)
        {
            m_viewModel.Cancel();
            Close();
        }
    }
}
