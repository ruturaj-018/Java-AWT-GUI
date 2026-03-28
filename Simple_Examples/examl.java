package Simple_Examples;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class  windowadapater {
    public static void main(String[] args) {
        Frame frame = new Frame("Window Adapter Example");
        frame.setSize(300, 200);
        frame.addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }

        });
        frame.setVisible(true);
    }
}
