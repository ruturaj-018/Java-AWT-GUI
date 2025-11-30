package Simple_Examples;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseAdapterExample
import java.awt.Frame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseAdapterExample {
    public static void main(String[] args) {
        Frame frame = new Frame("Mouse Adapter Example");
        frame.setSize(300, 200);
        frame.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Mouse Clicked at: (" + e.getX() + ", " + e.getY() + ")");
            }
        });
        frame.setVisible(true);
    }
}
    }
}
