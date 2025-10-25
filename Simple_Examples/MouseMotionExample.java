package Simple_Examples;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MouseMotionExample {
    {
        Frame f1 = new Frame("Experiment No : 05");
        f1.addMouseMotionListener(this);

        f1.addWindowListener(w1);
        f1.setLayout(null);
        f1.setSize(500,500);
        f1.setVisible(true);
    }
    @Override
    public void mouseDragged(MouseEvent e) {
        System.out.println("Mouse dragged at: (" + e.getX() + ", " + e.getY() + ")");
    }
    WindowAdapter w1 = new WindowAdapter() {
        @Override
        public void windowClosing(WindowEvent e) {
            System.out.println("Mouse Dragged Event Completed Successfully.");
            System.out.println("Window is closed. Goodbye!!!");
            System.exit(0);
        }
    };

    public static void main(String[] args) {
}
