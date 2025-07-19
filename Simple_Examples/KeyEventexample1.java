package Simple_Examples;
import java.awt.*;
import java.awt.event.*;

public class KeyEventexample1 extends Frame implements KeyListener {
    private Label label;
    KeyEventexample1() {
        setTitle("Key Event Example");
        setSize(500, 500);
        setLayout(null);

        Label l1 = new Label("Press any key");
        add(l1);
        l1.setForeground(Color.GRAY);
        l1.setBounds(200,200,100,25);

        label = new Label();
        add(label);
        label.setBounds(200,250,100,25);

        addKeyListener(this);
        setVisible(true);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        label.setText("Key Pressed");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        label.setText("Key Released");
    }

    @Override
    public void keyTyped(KeyEvent e) {
        //label.setText("Key Typed");
    }

    public static void main(String[] args) {
        new art();
    }
}
