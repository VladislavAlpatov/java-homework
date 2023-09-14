package homework2.task3;

public class Circle {
    private Point center; // Центр окружности
    private double radius; // Радиус окружности

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public double getRadius() {
        return radius;
    }
}
