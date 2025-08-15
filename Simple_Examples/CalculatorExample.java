package Simple_Examples;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorExample {
    public static void main(String[] args) {
        // Create the main frame
        JFrame frame = new JFrame("Calculator Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(new GridLayout(4, 2, 10, 10));

        // Create text fields
        JTextField textField1 = new JTextField();
        JTextField textField2 = new JTextField();
        JTextField resultField = new JTextField();
        resultField.setEditable(false); // Make result field non-editable

        // Create buttons
        JButton addButton = new JButton("Add");
        JButton subtractButton = new JButton("Subtract");

        // Add components to the frame
        frame.add(new JLabel("First Number:"));
        frame.add(textField1);
        frame.add(new JLabel("Second Number:"));
        frame.add(textField2);
        frame.add(addButton);
        frame.add(subtractButton);
        frame.add(new JLabel("Result:"));
        frame.add(resultField);

        // Add action listeners to buttons
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(textField1.getText());
                    int num2 = Integer.parseInt(textField2.getText());
                    int result = num1 + num2;
                    resultField.setText(String.valueOf(result));
                } catch (NumberFormatException ex) {
                    resultField.setText("Invalid input");
                }
            }
        });

        subtractButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(textField1.getText());
                    int num2 = Integer.parseInt(textField2.getText());
                    int result = num1 - num2;
                    resultField.setText(String.valueOf(result));
                } catch (NumberFormatException ex) {
                    resultField.setText("Invalid input");
                }
            }
        });

        // Display the frame
        frame.setVisible(true);
    }
}

