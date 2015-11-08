
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

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


                    try {
                        DefaultHttpClient client = new DefaultHttpClient();
                        HttpPost post = new HttpPost("http://localhost:9998/userservice/create");
                        StringEntity input = new StringEntity("{\"login\":\"Jan Kowalski\",\"password\":\"123\"}");

                        input.setContentType("application/json");
                        post.setEntity(input);
                        org.apache.http.HttpResponse response = client.execute(post);
                        BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
                        String line = "";
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }

                    MainView mainView = new MainView();
                    mainView.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(LoginView.this, "Złe hasło lub login");
                }
            }
        });
    }

}
