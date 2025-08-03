package Simple_Examples; // Package for organizing Java examples

import java.awt.*;        // For GUI components like Frame and Scrollbar
import java.awt.event.*;  // For event handling like AdjustmentListener

// A simple AWT example to handle scrollbar adjustment events
public class AdjustmentEventExample extends Frame implements AdjustmentListener {

    Scrollbar scrollbar; // Scrollbar component

    // Constructor to set up the frame and scrollbar
    public AdjustmentEventExample() {
        scrollbar = new Scrollbar();                   // Create a scrollbar
        scrollbar.setBounds(50, 50, 20, 100);           // Position and size
        scrollbar.addAdjustmentListener(this);          // Add listener for changes
        add(scrollbar);                                 // Add scrollbar to frame
        setSize(200, 200);                              // Frame size
        setLayout(null);                                // Absolute positioning
        setVisible(true);                               // Show frame
    }

    // Called when scrollbar value changes
    public void adjustmentValueChanged(AdjustmentEvent e) {
        System.out.println("Scrollbar adjusted: " + e.getValue());
    }

    // Main method to run program
    public static void main(String[] args) {
        new AdjustmentEventExample();
    }
}


