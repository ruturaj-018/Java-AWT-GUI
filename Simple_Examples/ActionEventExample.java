package Simple_Examples;
import java.awt.*;
import java.awt.event.*;

public class ActionEventExample extends Frame implements ActionListener {
    Button button;

    public ActionEventExample() {
        button = new Button("Click Me");
        button.setBounds(50, 100, 80, 30);
        button.addActionListener(this);
        add(button);
        setSize(200, 200);
        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        System.out.println("Button clicked!");
    }

    public static void main(String[] args) {
        new ActionEventExample();
    }
}


