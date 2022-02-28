import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Image {
    private JFrame frame;
    private ImageIcon icon;
    private JLabel label;

    public Image(String filename){
        String path = "assets/" + filename;
        frame = new JFrame();
        icon = new ImageIcon(path);
        label = new JLabel(icon);
        frame.add(label);
        frame.pack();
    }

    public void show(boolean b){
        frame.setVisible(b);
    }
}
