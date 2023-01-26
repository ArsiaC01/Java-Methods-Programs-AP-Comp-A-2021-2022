// Code written as part of the Java-Methods-Program-AP-Comp-A-2021-2022 repository on GitHub.
package chapter06.piechart;

import java.awt.*;
import javax.swing.*;

/**
 * A {@link JFrame} window that
 */
public class Poll extends JFrame {
    public Poll() {
        super("Vote for Tami, Brian, or Liz");

        Container c = getContentPane();
        c.setBackground(Color.WHITE);
        PollDisplayPanel chart = new PollDisplayPanel("Tami", "Brian", "Liz");
        PollControlPanel controls = new PollControlPanel(chart);
        c.add(chart, BorderLayout.CENTER);
        c.add(controls, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        Poll w = new Poll();
        w.setBounds(300, 300, 400, 400);
        w.setDefaultCloseOperation(EXIT_ON_CLOSE);
        w.setVisible(true);
    }
}