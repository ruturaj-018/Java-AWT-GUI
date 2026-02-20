package Simple_Examples;
import java.awt.*;
import java.awt.event.*;

public class TextEvent extends Frame implements TextListener {
    TextField textField;
    public TextEvent() {
        textField = new TextField();
        textField.setBounds(50, 50, 100, 30);
        textField.addTextListener(this);
        add(textField);
        setSize(200, 200);
        setLayout(null);
        setVisible(true);
    }
    public void textValueChanged(TextEvent e) {
        System.out.println("Text changed: " + textField.getText());
    }

    public static void main(String[] args) {
        new TextEventExample();
    }
}
