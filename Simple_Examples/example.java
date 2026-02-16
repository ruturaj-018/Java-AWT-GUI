import java.awt.*;
import java.awt.event.*;

public class TextEventExample extends Frame implements TextListener {
    TextField textField;
    public TextEventExample() {
        textField = new TextField();
        textField.setBounds(50, 50, 100, 30);
        textField.addTextListener(this);
        add(textField);