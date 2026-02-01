import java.awt.*;
import java.awt.event.*;

public class TextCopieEvent {
    public static void main(String[] args) {
        // Create the main frame
        Frame frame = new Frame("TextEvent Example");
        frame.setSize(400, 200);
        frame.setLayout(new GridLayout(3, 1, 10, 10));
        // Create text fields
        TextField textField1 = new TextField();
        TextField textField2 = new TextField();
        textField2.setEditable(false); // Make the second text field non-editable
