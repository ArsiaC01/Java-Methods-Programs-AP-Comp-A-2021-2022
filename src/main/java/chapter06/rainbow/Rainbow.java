// Code written as part of the Java-Methods-Program-AP-Comp-A-2021-2022 repository on GitHub.
package chapter06.rainbow;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * A {@link JPanel} with a rainbow on it.
 */
public class Rainbow extends JPanel {
    private static final Color SKY_COLOR = Color.CYAN;

    public Rainbow() {
        setBackground(SKY_COLOR);
    }

    /**
     * Overrides the {@link JPanel#paintComponent(Graphics) paintComponent()} method in {@link JPanel} to
     * draw a rainbow.
     */
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        int width = getWidth();
        int height = getHeight();
        int xCenter = width / 2;
        int yCenter = (3 * height) / 4;

        int largeRadius = width / 4;
        int smallRadius = height / 4;
        int mediumRadius = (int) Math.sqrt(smallRadius * largeRadius);
        int skyRadius = largeRadius - 3 * mediumRadius + 3 * smallRadius;

        g.setColor(Color.RED);
        g.fillArc(xCenter - largeRadius, yCenter - largeRadius, largeRadius * 2, largeRadius * 2, 0, 180);

        g.setColor(Color.GREEN);
        g.fillArc(xCenter - mediumRadius, yCenter - mediumRadius, mediumRadius * 2, mediumRadius * 2, 0, 180);

        g.setColor(Color.MAGENTA);
        g.fillArc(xCenter - smallRadius, yCenter - smallRadius, smallRadius * 2, smallRadius * 2, 0, 180);

        g.setColor(Color.CYAN);
        g.fillArc(xCenter - skyRadius, yCenter - skyRadius, skyRadius * 2, skyRadius * 2, 0, 180);
    }

    public static void main(String[] args) {
        JFrame w = new JFrame("chapter06.rainbow.Rainbow");
        w.setBounds(300, 300, 300, 200);
        w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = w.getContentPane();
        c.add(new Rainbow());
        w.setVisible(true);
    }
}