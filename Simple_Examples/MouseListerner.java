package Simple_Examples;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseListerner extends Frame implements MouseListener {
    MouseListerner() {
        setTitle("Mouse_event");
        setSize(500, 500);
        setVisible(true);
        addMouseListener(this);
    }
    @Override
    public void mouseClicked (MouseEvent e){
        setBackground(Color.BLUE);

    }

    @Override
    public void mousePressed (MouseEvent e){
        setBackground(Color.GREEN);
    }

    @Override
    public void mouseReleased (MouseEvent e){
        setBackground(Color.yellow);
    }

    @Override
    public void mouseEntered (MouseEvent e){
        setBackground(Color.RED);
    }

    @Override
    public void mouseExited (MouseEvent e){
        setBackground(Color.DARK_GRAY);
    }

    public static void main(String[] args) {

        new MouseListerner();
    }
}
