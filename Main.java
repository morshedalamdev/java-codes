import java.awt.GraphicsEnvironment;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args){
        String message = "Welcom";

        if (GraphicsEnvironment.isHeadless()) {
            throw new IllegalStateException(
                "GUI display is required to show the dialog. Run this program in a desktop session with X11/Wayland support."
            );
        }

        JOptionPane.showMessageDialog(null, message);
    }
}