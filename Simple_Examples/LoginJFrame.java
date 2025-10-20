package Simple_Examples;
import javax.swing.*;
public class LoginJFrame extends JFrame {
    LoginJFrame() {
            setTitle("Jpassward_Field");
            setSize(500, 500);
            setLayout(null);
            setVisible(true);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JLabel la = new JLabel("Wel-Come");
            la.setBounds(140, 60, 210, 80);
            add(la);

            JLabel l1 = new JLabel("Username :");
            l1.setBounds(100, 150, 80, 30);
            add(l1);

            JLabel l2 = new JLabel("Passward :");
            l2.setBounds(100, 200, 80, 30);
            add(l2);

            JTextField t1 = new JTextField();
            t1.setBounds(190,150,90,30);
            add(t1);

            JPasswordField p1 = new JPasswordField(10);
            p1.setBounds(190,200,90,30);
            p1.setEchoChar('#');
            add(p1);

        }
        public static void main(String[] args) {
        
        new LoginJFrame();
        }
    }