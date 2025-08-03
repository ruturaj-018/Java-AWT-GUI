package Simple_Examples; // Package name for organization of classes

import java.awt.*;          // For GUI components like Frame, Label, Color
import java.awt.event.*;    // For event handling classes like KeyListener, KeyEvent

// This class extends Frame (to create a window) and implements KeyListener (to listen for key events)
public class KeyEventexample1 extends Frame implements KeyListener {

    private Label label; // Label to display messages based on key events

    // Constructor to set up the Frame and components
    KeyEventexample1() {
        setTitle("Key Event Example"); // Title of the window
        setSize(500, 500);             // Window size (width x height)
        setLayout(null);               // No layout manager, manual positioning

        // Static label prompting user to press any key
        Label l1 = new Label("Press any key");
        add(l1); // Add label to frame
        l1.setForeground(Color.GRAY); // Set label text color
        l1.setBounds(200, 200, 100, 25); // Position and size of label

        // Dynamic label to show key press/release messages
        label = new Label();
        add(label); // Add label to frame
        label.setBounds(200, 250, 100, 25); // Position and size of label

        // Add key listener to frame to detect keyboard events
        addKeyListener(this);

        setVisible(true); // Make the frame visible
    }

    // Method called when a key is pressed
    @Override
    public void keyPressed(KeyEvent e) {
        label.setText("Key Pressed"); // Update label text
    }

    // Method called when a key is released
    @Override
    public void keyReleased(KeyEvent e) {
        label.setText("Key Released"); // Update label text
    }

    // Method called when a key is typed (optional here)
    @Override
    public void keyTyped(KeyEvent e) {
        // Uncomment below line if you want to detect key typed events
        // label.setText("Key Typed");
    }

    // Main method to run the program
    public static void main(String[] args) {
        new KeyEventexample1(); // Create an object to start the program
    }
}
