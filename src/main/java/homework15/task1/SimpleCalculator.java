package homework15.task1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalculator {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 200);

        JPanel panel = new JPanel();
        frame.add(panel);

        JLabel label1 = new JLabel("Number 1:");
        JTextField textField1 = new JTextField(10);
        JLabel label2 = new JLabel("Number 2:");
        JTextField textField2 = new JTextField(10);
        JButton addButton = new JButton("Add them up");

        panel.add(label1);
        panel.add(textField1);
        panel.add(label2);
        panel.add(textField2);
        panel.add(addButton);

        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(textField1.getText());
                    double num2 = Double.parseDouble(textField2.getText());
                    double result = num1 + num2;

                    JOptionPane.showMessageDialog(frame, "The result is: " + result);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Please enter valid numbers.");
                }
            }
        });

        frame.setVisible(true);
    }
}
