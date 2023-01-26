// Code written as part of the Java-Methods-Program-AP-Comp-A-2021-2022 repository on GitHub.
package chapter06.bmi;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.text.DecimalFormat;

/**
 * A {@link JFrame} window that calculates BMI from pounds and inches.
 */
public class Bmi extends JFrame implements ActionListener {
    private JTextField massInputField;
    private JTextField heightInputField;
    private JTextField bmiDisplayField;

    public Bmi() {
        super("BMI Calculator");
        JLabel labelLbs = new JLabel("Weight (lbs.):", SwingConstants.RIGHT);
        massInputField = new JTextField(5);
        JLabel labelInches = new JLabel("Height (in.):", SwingConstants.RIGHT);
        heightInputField = new JTextField(5);
        JLabel labelBmi = new JLabel("BMI = ", SwingConstants.RIGHT);
        bmiDisplayField = new JTextField(5);
        bmiDisplayField.setEditable(false);
        JButton go = new JButton("Compute");
        go.addActionListener(this);

        Container c = getContentPane();
        c.setBackground(Color.white);
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2, 5, 5));
        panel.add(labelLbs);
        panel.add(massInputField);
        panel.add(labelInches);
        panel.add(heightInputField);
        panel.add(labelBmi);
        panel.add(bmiDisplayField);
        c.add(panel, BorderLayout.CENTER);
        c.add(go, BorderLayout.SOUTH);
    }

    /**
     * Called when the "Compute" button is clicked.
     * @throws NumberFormatException when non-integers are entered into the height and mass input fields. Input
     * verification should be used to mitigate this.
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        int pounds = Integer.parseInt(massInputField.getText());
        int inches = Integer.parseInt(heightInputField.getText());
        double bmi = calculateBmi(pounds, inches);
        DecimalFormat df = new DecimalFormat("00.0");
        bmiDisplayField.setText(df.format(bmi));
    }

    /**
     * Calculates body mass index.
     * @param pounds mass in pounds.
     * @param inches height in inches.
     * @return BMI in kilograms per square meter.
     */
    private double calculateBmi(int pounds, int inches) {
        double kilograms = pounds * 0.454;
        double meters = inches * 0.0254;
        return kilograms / Math.pow(meters, 2);
    }

    public static void main(String[] args) {
        Bmi w = new Bmi();
        w.setBounds(300, 300, 300, 160);
        w.setDefaultCloseOperation(EXIT_ON_CLOSE);
        w.setVisible(true);
    }
}