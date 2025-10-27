package Simple_Examples;
import java.awt.*;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class FocusAdapterExample {
    public static void main(String[] args) {
        Frame frame = new Frame();
        TextField textField = new TextField();
        textField.setBounds(50, 50, 200, 30);
        textField.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                System.out.println("TextField gained focus");
            }
        });
        frame.add(textField);
        frame.setSize(300, 200);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
