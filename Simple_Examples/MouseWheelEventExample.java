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
    
}
