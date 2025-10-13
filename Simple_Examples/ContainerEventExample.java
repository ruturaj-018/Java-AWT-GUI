package Simple_Examples;
import java.awt.*;
import java.awt.event.*;

public class ContainerEventExample extends Frame implements ContainerListener {

    public ContainerEventExample() {
        addContainerListener(this);
        setSize(200, 200);
        setLayout(null);
        setVisible(true);
    }

    public void componentAdded(ContainerEvent e) {
        System.out.println("Component added");
    }

    public void componentRemoved(ContainerEvent e) {
        System.out.println("Component removed");
    }

    public static void main(String[] args) {
        new ContainerEventExample();
    }
}
