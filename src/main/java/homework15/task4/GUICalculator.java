package homework15.task1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUICalculator {
    private JFrame frame;
    private JTextField textField;
    private double num1, num2, result;
    private char operation;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                GUICalculator window = new GUICalculator();
                window.frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public GUICalculator() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 300, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        textField = new JTextField();
        textField.setBounds(10, 11, 260, 39);
        frame.getContentPane().add(textField);
        textField.setColumns(10);

        String[] buttonLabels = {"1", "2", "3", "+", "4", "5", "6", "-", "7", "8", "9", "*", "0", "C", "=", "/"};
        int x = 10, y = 60, width = 60, height = 60;

        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.setBounds(x, y, width, height);
            button.addActionListener(new ButtonClickListener());
            frame.getContentPane().add(button);

            x += 70;
            if (x > 220) {
                x = 10;
                y += 70;
            }
        }
    }

    private class ButtonClickListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();
            if ((command.charAt(0) >= '0' && command.charAt(0) <= '9') || command.charAt(0) == '.') {
                textField.setText(textField.getText() + command);
            } else if (command.charAt(0) == 'C') {
                textField.setText("");
                num1 = num2 = result = 0;
                operation = '\0';
            } else if (command.charAt(0) == '=') {
                num2 = Double.parseDouble(textField.getText());
                switch (operation) {
                    case '+':
                        result = num1 + num2;
                        break;
                    case '-':
                        result = num1 - num2;
                        break;
                    case '*':
                        result = num1 * num2;
                        break;
                    case '/':
                        if (num2 == 0) {
                            textField.setText("Error");
                            return;
                        }
                        result = num1 / num2;
                        break;
                }
                textField.setText(String.valueOf(result));
                num1 = result;
                operation = '\0';
            } else {
                if (!textField.getText().isEmpty()) {
                    num1 = Double.parseDouble(textField.getText());
                }
                operation = command.charAt(0);
                textField.setText("");
            }
        }
    }
}
