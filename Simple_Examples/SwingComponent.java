package Simple_Examples;

import javax.swing.*;
import java.awt.*;

public class SwingComponent {
    public static void main(String[] args) {
        // Create the main frame
        JFrame frame = new JFrame("Swing Components Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 800);

        // Create a panel to hold components
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(10, 2, 10, 10));

        // Add components to the panel
        panel.add(new JLabel("Label:"));
        panel.add(new JTextField("Text Field"));

        panel.add(new JButton("Button"));
        panel.add(new JCheckBox("Check Box"));

        panel.add(new JRadioButton("Radio Button"));
        panel.add(new JComboBox<>(new String[]{"Item 1", "Item 2", "Item 3"}));

        panel.add(new JList<>(new String[]{"List Item 1", "List Item 2", "List Item 3"}));
        panel.add(new JScrollPane(new JTextArea("Text Area", 5, 20)));

        panel.add(new JSlider());
        panel.add(new JProgressBar());
    }
}
