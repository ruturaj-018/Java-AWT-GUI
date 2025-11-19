package Simple_Examples;

import java.awt.Frame;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyAdapterExample {
    public static void main(String[] args) {
        Frame frame = new Frame("Key Adapter Example");
        frame.setSize(300, 200);
        frame.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("Key Pressed: " + e.getKeyChar());
            }
        });
        frame.setVisible(true);
    }
}

