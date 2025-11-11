package Simple_Examples;

import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

public class InputEventExample {
    public InputEventExample() {
        addKeyListener(this);
        addMouseListener(this);
        setSize(200, 200);
        setLayout(null);
        setVisible(true);
    }

    public void keyPressed(KeyEvent e) {
        System.out.println("Key pressed: " + e.getKeyChar());
    }

    public void keyReleased(KeyEvent e) {
        System.out.println("Key released: " + e.getKeyChar());
    }

    public void keyTyped(KeyEvent e) {
        System.out.println("Key typed: " + e.getKeyChar());
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
        new InputEventExample();
    }
}
