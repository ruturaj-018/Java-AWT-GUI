package Simple_Examples;

import java.awt.*;
import java.awt.event.*;

public class MouseEventExample extends Frame implements MouseListener {

    public MouseEventExample() {
        addMouseListener(this);
        setSize(200, 200);
        setLayout(null);
        setVisible(true);
    }

    public void mouseClicked(MouseEvent e) {
        System.out.println("Mouse clicked at: " + e.getX() + ", " + e.getY());
    }

    public void mousePressed(MouseEvent e) {
        System.out.println("Mouse pressed");
    }

    public void mouseReleased(MouseEvent e) {
        System.out.println("Mouse released");
    }

    public void mouseEntered(MouseEvent e) {
        System.out.println("Mouse entered");
    }

    public void mouseExited(MouseEvent e) {
        System.out.println("Mouse exited");
    }

    public static void main(String[] args) {
        new MouseEventExample();
    }
}
