package Simple_Examples;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;

public class ContainerAdapterExample {
    public static void main(String[] args) {
        Frame frame = new Frame("Container Adapter Example");
        Panel panel = new Panel();
        frame.add(panel);
        frame.setSize(300, 200);
        panel.addContainerListener(new ContainerAdapter() {
            @Override
            public void componentAdded(ContainerEvent e) {
                System.out.println("Component Added");
            }
        });
        frame.setVisible(true);

        // Adding a new component to the panel to trigger the event
        panel.add(new java.awt.Button("New Button"));
        frame.validate();
    }
}
