// Code written as part of the Java-Methods-Program-AP-Comp-A-2021-2022 repository on GitHub.
package chapter05.morning;

import javax.swing.*;
import java.awt.*;

public class Morning extends JFrame {
    public Morning() {
        super("Morning");
        EasySound rooster = new EasySound("roost.wav");
        rooster.play();

        Container c = getContentPane();
        c.setBackground(Color.WHITE);
    }

    public static void main(String[] args) {
        Morning morning = new Morning();
        morning.setSize(300, 150);
        morning.setDefaultCloseOperation(EXIT_ON_CLOSE);
        morning.setVisible(true);
    }
}