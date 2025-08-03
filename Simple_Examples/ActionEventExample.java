package Simple_Examples; // Package for organizing Java examples

import java.awt.*;        // For GUI components like Frame and Button
import java.awt.event.*;  // For event handling interfaces like ActionListener

// This class creates a simple AWT frame with a button and handles button click events
public class ActionEventExample extends Frame implements ActionListener {

    Button button; // Button component

    // Constructor to initialize the frame and components
    public ActionEventExample() {
        // Create a button with label "Click Me"
        button = new Button("Click Me");
        button.setBounds(50, 100, 80, 30); // Set position (x, y) and size (width, height)

        // Register this class as the event listener for the button click
        button.addActionListener(this);

        // Add the button to the frame
        add(button);

        // Set frame properties
        setSize(200, 200);     // Width and height of frame
        setLayout(null);       // No layout manager (absolute positioning)
        setVisible(true);      // Make the frame visible
    }

    // Method that is called automatically when the button is clicked
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Button clicked!"); // Print message to console
    }

    // Main method to launch the program
    public static void main(String[] args) {
        new ActionEventExample(); // Create the frame instance
    }
}
