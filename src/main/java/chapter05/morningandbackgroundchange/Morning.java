// Code written as part of the Java-Methods-Program-AP-Comp-A-2021-2022 repository on GitHub.
package chapter05.morningandbackgroundchange;

import chapter05.morning.EasySound;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Morning extends JFrame implements ActionListener {
    private EasySound rooster;
    private EasySound cow;
    private int time;
    private Color color = Color.WHITE;

    public Morning() {
        super("Morning");
        rooster = new EasySound("roost.wav");
        cow = new EasySound("moo.wav");

        Container c = getContentPane();
        c.setBackground(Color.WHITE);

        time = 0;
        Timer clock = new Timer(30, this);
        clock.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Container c = getContentPane();

        time++;
        if (time % 50 == 0) {
            if (color == Color.BLACK) {
                rooster.play();
                c.setBackground(Color.WHITE);
                color = Color.WHITE;
            } else {
                cow.play();
                c.setBackground(Color.BLACK);
                color = Color.BLACK;
            }
        }
        repaint();
    }

    public static void main(String[] args) {
        Morning morning = new Morning();
        morning.setSize(300, 150);
        morning.setDefaultCloseOperation(EXIT_ON_CLOSE);
        morning.setVisible(true);
    }
}