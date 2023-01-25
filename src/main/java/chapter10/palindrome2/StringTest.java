// Code written as part of the Java-Methods-Program-AP-Comp-A-2021-2022 repository on GitHub.
package chapter10.palindrome2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static chapter10.palindrome2.PalindromeExtended.isPalindrome;

public class StringTest extends JFrame implements ActionListener {
    private final JTextField input;
    private final JTextField result;

    /**
     * @apiNote Provided by textbook.
     */
    public StringTest() {
        super("StringTest");
        Box box1 = Box.createVerticalBox();
        box1.add(new JLabel("Input:"));
        box1.add(Box.createVerticalStrut(10));
        box1.add(new JLabel("Result:"));

        input = new JTextField(20);
        input.setBackground(Color.WHITE);
        input.addActionListener(this);
        input.selectAll();

        result = new JTextField(20);
        result.setBackground(Color.WHITE);
        result.setEditable(false);

        Box box2 = Box.createVerticalBox();
        box2.add(input);
        box2.add(Box.createVerticalStrut(10));
        box2.add(result);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        c.add(box1);
        c.add(box2);
        input.requestFocus();
    }

    /**
     * @apiNote Provided by textbook.
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        String str = input.getText();

        str = String.valueOf(isPalindrome(str));

        result.setText(str);
        input.selectAll();
    }

    public static void main(String[] args) {
        StringTest window = new StringTest();
        window.setBounds(100, 100, 300, 100);
        window.setDefaultCloseOperation(EXIT_ON_CLOSE);
        window.setVisible(true);
    }
}