package homework5.task4;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

import javax.swing.*;
import java.awt.*;

public class AnimatedGIFExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Animated GIF Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);

        // Загрузите ваш анимированный GIF как ImageIcon
        ImageIcon icon = new ImageIcon("/home/vlad/Downloads/xd.gif"); // Указывайте прямой путь к файлу

        // Создайте JLabel и установите его иконкой ваш анимированный GIF
        JLabel label = new JLabel(icon);

        frame.getContentPane().add(label, BorderLayout.CENTER);
        frame.setVisible(true);
    }
}

