// Code written as part of the Java-Methods-Program-AP-Comp-A-2021-2022 repository on GitHub.
package chapter09.snackbar;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SnackBar extends JFrame implements ActionListener {
    private static final String PASSWORD = "jinx";
    private VendingMachine machine1;
    private VendingMachine machine2;
    private VendingMachine machine3;

    public SnackBar() {
        super("Snack Bar");

        Color brandColor1 = new Color(130, 30, 10);
        Color brandColor2 = new Color(255, 180, 0);
        Color brandColor3 = new Color(90, 180, 0);

        ImageIcon coin = new ImageIcon("coin.gif");

        machine1 = new VendingMachine("Java", brandColor1, 45, coin);
        machine2 = new VendingMachine("JApple", brandColor2, 50, coin);
        machine3 = new VendingMachine("Jinx", brandColor3, 35, coin);

        Box wall = Box.createHorizontalBox();
        wall.add(Box.createHorizontalStrut(5));
        wall.add(machine1);
        wall.add(Box.createHorizontalStrut(5));
        wall.add(machine2);
        wall.add(Box.createHorizontalStrut(5));
        wall.add(machine3);
        wall.add(Box.createHorizontalStrut(5));

        JPanel service = new JPanel();
        service.add(new JLabel(" Service login: "));
        JPasswordField password = new JPasswordField("", 5);
        password.addActionListener(this);
        service.add(password);

        Container c = getContentPane();
        c.setBackground(Color.GRAY);
        c.add(wall, BorderLayout.CENTER);
        c.add(service, BorderLayout.SOUTH);
    }

    /**
     * This method is called whenever a component with this {@link SnackBar} registered on it fires
     * an {@link ActionEvent}.
     * <p>
     * Since {@link SnackBar} inherits {@link ActionListener} using the {@code implements} keyword,
     * it must have a {@code public void actionPerformed(ActionEvent)} method. Components can
     * register it by passing {@code this} as an {@link ActionListener} to an
     * {@code addActionListener} method if they have one.
     *
     * @see chapter11 Chapter 11 - Class Hierarchies and Interfaces
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        JPasswordField passwordField = (JPasswordField) e.getSource();
        String word = new String(passwordField.getPassword());
        passwordField.setText("");

        if (!PASSWORD.equals(word)) {
            JOptionPane.showMessageDialog(this, // SnackBar inherits from a JFrame, so it is the parent
                    "Login failed", "Service", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // double amt = Vendor.getTotalSales();
        machine1.reload();
        machine2.reload();
        machine3.reload();
        JOptionPane.showMessageDialog(
                this,
                // String.format("Total sales: $%.2f\n", amt) +
                "Machines reloaded",
                "Service",
                JOptionPane.INFORMATION_MESSAGE
        );
    }

    public static void main(String[] args) {
        SnackBar window = new SnackBar();
        window.setBounds(50, 50, 520, 310);
        window.setDefaultCloseOperation(EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setVisible(true);
    }
}