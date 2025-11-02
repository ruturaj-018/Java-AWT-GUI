package Simple_Examples;

import java.awt.*;
import java.awt.event.FocusListener;

public class FocusEventExample extends Frame implements FocusListener {
    TextField textField;

    public FocusEventExample() {
        textField = new TextField();
        textField.setBounds(50, 50, 100, 30);
        textField.addFocusListener(this);
        add(textField);
        setSize(200, 200);
        setLayout(null);
        setVisible(true);
    }
}
