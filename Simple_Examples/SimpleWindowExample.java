package Simple_Examples;

import java.awt.*;
import java.awt.event.*;
public class example{
    public static void main(String[] args) {
        Frame f1 = new Frame("Experiment No : 05");
        WindowAdapter w1 = new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("Window is closed. Goodbye!!!");
                System.exit(0);
            }
        };
        f1.addWindowListener(w1);
        Label l1 = new Label("Welcome to SITCOE");
        l1.setBounds(200,150,120,40);
        f1.add(l1);
        f1.setSize(300, 200);
        f1.setLayout(null);
        f1.setVisible(true);
    }
}
