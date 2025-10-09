package Simple_Examples;
import java.awt.Frame;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class ComponentAdapterExample {
    public static void main(String[] args) {
        Frame frame = new Frame("Component Adapter Example");
        frame.setSize(300, 200);
        frame.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                System.out.println("Component Resized");
            }
        });
        frame.setVisible(true);
    }
}
