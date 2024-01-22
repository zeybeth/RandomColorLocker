package randomcolor;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
public class MyMouseAdaptor extends MouseAdapter {

    private RandomPanel panel;

    public MyMouseAdaptor(RandomPanel panel) {
        this.panel = panel;
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if (panel.isColorChangeEnabled()) {
            panel.setBackground(panel.randomColor());
        }
    }
}