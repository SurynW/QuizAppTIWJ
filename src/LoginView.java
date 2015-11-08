import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

/**
 * Created by kamilwysocki on 08/11/15.
 */
public class LoginView extends JFrame {
    private JButton loginButton;
    private JTextField loginTextField;
    private JPasswordField passwordTextField;
    private JPanel rootPanel;

    public LoginView() {
        super("Quiz app - Login");
        setContentPane(rootPanel);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Objects.equals(loginTextField.getText(), "admin")) {
                    MainView mainView = new MainView();
                    mainView.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(LoginView.this,"Złe hasło lub login");
                }
            }
        });
    }

}
