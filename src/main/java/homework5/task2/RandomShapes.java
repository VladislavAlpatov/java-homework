package homework5.task2;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

abstract class Shape {
    public int x, y;
    public Color color;

    public Shape(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public abstract void draw(Graphics g);
}

class Circle extends Shape {
    int radius;

    public Circle(int x, int y, int radius, Color color) {
        super(x, y, color);
        this.radius = radius;
    }

    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(x, y, radius, radius);
    }
}

class Square extends Shape {
    int side;

    public Square(int x, int y, int side, Color color) {
        super(x, y, color);
        this.side = side;
    }

    public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, side, side);
    }
}

public class RandomShapes extends JPanel {

    Shape[] shapes;

    public RandomShapes() {
        shapes = new Shape[20];
        Random rand = new Random();

        for (int i = 0; i < shapes.length; i++) {
            int x = rand.nextInt(250);
            int y = rand.nextInt(250);
            Color color = new Color(rand.nextFloat(), rand.nextFloat(), rand.nextFloat());

            if (rand.nextBoolean()) {
                shapes[i] = new Circle(x, y, 50, color);
            } else {
                shapes[i] = new Square(x, y, 50, color);
            }
        }
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        for (Shape shape : shapes) {
            shape.draw(g);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Random Shapes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.add(new RandomShapes());
        frame.setVisible(true);
    }
}
