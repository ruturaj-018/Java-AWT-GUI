package Simple_Examples;
import java.awt.*;
import java.awt.event.*;

public class KeyEventExample extends Frame implements KeyListener {

    public KeyEventExample() {
        addKeyListener(this);
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

    public static void main(String[] args) {
        new KeyEventExample();
    }
}

