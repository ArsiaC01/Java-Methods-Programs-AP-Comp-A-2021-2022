// Code written as part of the Java-Methods-Program-AP-Comp-A-2021-2022 repository on GitHub.
package chapter05.syntax;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MovingDisk extends JPanel implements ActionListener {
    private int time;

    public MovingDisk() {
        time = 0;
        Timer clock = new Timer(30, this);
        clock.start();
    }

    @Override
    public void paintComponent(Graphics g) {
        int x = 150 - (int) (100 * Math.cos(0.005 * Math.PI * time));
        int y = 130 - (int) (75 * Math.sin(0.005 * Math.PI * time));
        int radius = 20;

        Color sky;
        if (y > 130) {
            sky = Color.BLACK;
        } else {
            sky = Color.CYAN;
        }
        setBackground(sky);
        super.paintComponent(g);

        g.setColor(Color.ORANGE);
        g.fillOval(x - radius, y - radius, 2 * radius, 2 * radius);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        time++;
        repaint();
    }

    public static void main(String[] args) {
        JFrame w = new JFrame("Moving Disk");
        w.setSize(300, 150);
        w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = w.getContentPane();
        c.add(new MovingDisk());
        w.setResizable(false);
        w.setVisible(true);
    }
}