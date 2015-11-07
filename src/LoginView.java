import javax.swing.*;

/**
 * Created by kamilwysocki on 08/11/15.
 */
public class LoginView extends JFrame {
    private JButton loginButton;
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JPanel rootPanel;

    public LoginView() {
        super("Quiz app - Login");

        setContentPane(rootPanel);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
