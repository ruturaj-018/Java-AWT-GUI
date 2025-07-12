package Simple_Examples;
import java.awt.*;
import java.awt.event.*;

public class AdjustmentEventExample extends Frame implements AdjustmentListener {
    Scrollbar scrollbar;

    public AdjustmentEventExample() {
        scrollbar = new Scrollbar();
        scrollbar.setBounds(50, 50, 20, 100);
        scrollbar.addAdjustmentListener(this);
        add(scrollbar);
        setSize(200, 200);
        setLayout(null);
        setVisible(true);
    }

    public void adjustmentValueChanged(AdjustmentEvent e) {
        System.out.println("Scrollbar adjusted: " + e.getValue());
    }

    public static void main(String[] args) {
        new AdjustmentEventExample();
    }
}

