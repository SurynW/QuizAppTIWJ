import javax.swing.*;

/**
 * Created by kamilwysocki on 08/11/15.
 */
public class MainView extends JFrame{
    private JButton logOutButton;
    private JPanel rootPanel;
    private JButton zagrajButton;


    public MainView(){
        super("Quiz app");
        setContentPane(rootPanel);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
