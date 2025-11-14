package Simple_Examples;
import java.awt.*;
import java.awt.event.*;

public class ItemEventExample extends Frame implements ItemListener {
    Checkbox checkbox;

    public ItemEventExample() {
        checkbox = new Checkbox("Check me");
        checkbox.setBounds(50, 50, 100, 30);
        checkbox.addItemListener(this);
        add(checkbox);
        setSize(200, 200);
        setLayout(null);
        setVisible(true);
    }

    public void itemStateChanged(ItemEvent e) {
        System.out.println("Checkbox state changed: " + (e.getStateChange() == ItemEvent.SELECTED ? "Selected" : "Deselected"));
    }

    public static void main(String[] args) {
        new ItemEventExample();
    }
}
