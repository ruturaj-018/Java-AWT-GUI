package Simple_Examples;
import java.awt.*;
import java.awt.event.*;

public class ComponentEventExample extends Frame implements ComponentListener {

    public ComponentEventExample() {
        addComponentListener(this);
        setSize(200, 200);
        setLayout(null);
        setVisible(true);
    }

    public void componentResized(ComponentEvent e) {
        System.out.println("Component resized");
    }

    public void componentMoved(ComponentEvent e) {
        System.out.println("Component moved");
    }

    public void componentShown(ComponentEvent e) {
        System.out.println("Component shown");
    }

    public void componentHidden(ComponentEvent e) {
        System.out.println("Component hidden");
    }

    public static void main(String[] args) {
        new ComponentEventExample();
    }
}

