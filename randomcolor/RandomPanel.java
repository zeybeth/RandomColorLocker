package randomcolor;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class RandomPanel extends JPanel {

    private JCheckBox lockCheckBox;

    public RandomPanel() {
        setLayout(new FlowLayout());
        lockCheckBox = new JCheckBox("Lock");
        add(lockCheckBox);
        setBackground(randomColor());
        addMouseListener(new MyMouseAdaptor(this));
    }

    public Color randomColor() {
        int red = (int) (Math.random() * 256);
        int green = (int) (Math.random() * 256);
        int blue = (int) (Math.random() * 256);
        return new Color(red, green, blue);
    }

    public boolean isColorChangeEnabled() {
        return !lockCheckBox.isSelected();
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Colorful Worlds");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container pane = frame.getContentPane();
        pane.setLayout(new GridLayout(5, 5));
        frame.setSize(800, 800);
        frame.setVisible(true);

        for (int i = 0; i < 25; i++) {
            RandomPanel panel = new RandomPanel();
            pane.add(panel);
        }
    }
}


