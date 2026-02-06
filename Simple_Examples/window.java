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

        // Add components to the frame
        frame.add(new Label("Enter text in the first field:"));
        frame.add(textField1);
        frame.add(new Label("Copied text will appear here:"));
        frame.add(textField2);

        // Add text listener to the first text field
        textField1.addTextListener(new TextListener() {
            @Override
            public void textValueChanged(TextEvent e) {
                textField2.setText(textField1.getText());
            }
        });

        // Display the frame
        frame.setVisible(true);

        // Add a window listener to close the frame
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }
}