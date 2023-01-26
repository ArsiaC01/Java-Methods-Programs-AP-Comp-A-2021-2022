// Code written as part of the Java-Methods-Program-AP-Comp-A-2021-2022 repository on GitHub.
package chapter06.piechart;

import javax.swing.*;
import java.awt.*;

/**
 * A class that holds the vote counts and displays the numbers and the pie chart for them.
 */
public class PollDisplayPanel extends JPanel {
    private String name1;
    private String name2;
    private String name3;
    private int count1;
    private int count2;
    private int count3;

    public PollDisplayPanel(String name1, String name2, String name3) {
        setBackground(Color.WHITE);
        this.name1 = name1;
        this.name2 = name2;
        this.name3 = name3;
        count1 = 0;   // These are optional as Java automatically initializes class properties to reasonable defaults
        count2 = 0;   // (e.g., int to 0, float to 0.0f, any Object to null). However, it is considered bad style to
        count3 = 0;   // rely on this. https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
    }

    public void vote1() {
        count1++;
    }

    public void vote2() {
        count2++;
    }

    public void vote3() {
        count3++;
    }

    @Override
    public String toString() {
        return (name1 + ": " + count1 + ", " + name2 + ": " + count2 + ", " + name3 + ": " + count3);
    }

    /**
     * Overrides the {@link JPanel#paintComponent(Graphics) paintComponent()} method in {@link JPanel} to
     * draw a pie chart.
     */
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        int width = getWidth();
        int height = getHeight();
        int x = width / 2;
        int y = height / 2;
        int radius = Math.min(width, height) / 4;
        drawPieChart(g, x, y, radius);
        drawLegend(g, x, y, radius);
    }

    /**
     * Draws a pie chart.
     * <p>
     * To avoid gaps in the picture, the following algorithm is used:
     * <ol>
     *     <li>Set {@code fromDegree} to 0.</li>
     *     <li>Draw the red sector and increment {@code fromDegree} by its size.</li>
     *     <li>Draw the green sector and increment {@code fromDegree} by its size.</li>
     *     <li>Set the size of the blue sector to the remaining area, except if it is less than zero, at which
     *     point we set it to zero. Occasionally, due to rounding errors, {@code fromDegree} may be set to 361 if,
     *     for example, count1 = 5, count2 = 11, and count3 = 0.</li>
     * </ol>
     *
     * @param g the {@link Graphics} context to be used.
     * @param x TODO needs description
     * @param y TODO needs description
     * @param radius the radius of the pie chart to be drawn.
     */
    private void drawPieChart(Graphics g, int x, int y, int radius) {
        int total = count1 + count2 + count3;
        int fromDegree = 0;

        if (total > 0) {
            int degrees;
            g.setColor(Color.RED);
            degrees = countToDegrees(count1, total);
            drawSector(g, x, y, radius, fromDegree, degrees);
            fromDegree += degrees;

            g.setColor(Color.GREEN);
            degrees = countToDegrees(count2, total);
            drawSector(g, x, y, radius, fromDegree, degrees);
            fromDegree += degrees;

            g.setColor(Color.BLUE);
            degrees = Math.max(360 - fromDegree, 0);
            drawSector(g, x, y, radius, fromDegree, degrees);
        } else {
            g.setColor(Color.LIGHT_GRAY);
            drawSector(g, x, y, radius, fromDegree, 360);
        }
    }

    /**
     * Draws a legend containing vote counts and their corresponding colored squares.
     * @param g the {@link Graphics} context to be used.
     * @param x TODO
     * @param y TODO
     * @param r TODO
     */
    private void drawLegend(Graphics g, int x, int y, int r) {
        // Display the counts:
        y += (r + 20);
        g.setColor(Color.BLACK);
        g.drawString(name1 + ": " + count1, x - r, y);
        g.drawString(name2 + ": " + count2, x, y);
        g.drawString(name3 + ": " + count3, x + r, y);

        // Display the color squares:
        y += 5;
        x -= 2;
        g.setColor(Color.RED);
        g.fillRect(x - r, y, 10, 10);
        g.setColor(Color.GREEN);
        g.fillRect(x, y, 10, 10);
        g.setColor(Color.BLUE);
        g.fillRect(x + r, y, 10, 10);
    }

    /**
     * Converts a given proportion to degrees.
     * @param count the part of the total.
     * @param total the total.
     * @return the proportion in degrees.
     */
    private int countToDegrees(int count, int total) {
        return (int) ((double) count / total * 360);
    }

    /**
     * Draws a sector of a circle.
     *
     * @param g the {@link Graphics} context to be used.
     * @param x the <i>x</i>-coordinate of the center of the circle.
     * @param y the <i>y</i>-coordinate of the center of the circle.
     * @param radius the radius of the circle.
     * @param fromDegree the starting angle of the sector.
     * @param degrees the size of the sector in degrees.
     */
    private void drawSector(Graphics g, int x, int y, int radius, int fromDegree, int degrees) {
        if (degrees > 359) {
            g.fillOval(x - radius, y - radius, 2 * radius, 2 * radius);
        } else {
            g.fillArc(x - radius, y - radius, 2 * radius, 2 * radius, fromDegree, degrees);
        }
    }
}
