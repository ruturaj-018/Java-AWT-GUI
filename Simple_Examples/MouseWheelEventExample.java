package Simple_Examples;
import java.awt.*;
import java.awt.event.*;
public class MouseWheelEventExample extends Frame implements MouseWheelListener {

    public MouseWheelEventExample() {
        addMouseWheelListener(this);
        setSize(200, 200);
        setLayout(null);
        setVisible(true);
    }

    public void mouseWheelMoved(MouseWheelEvent e) {
        System.out.println("Mouse wheel moved: " + e.getWheelRotation());
    }

    public static void main(String[] args) {
        new MouseWheelEventExample();
    }
    
}
