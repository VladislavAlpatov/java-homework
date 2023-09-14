package homework2.task6;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public boolean equals(Circle otherCircle) {
        return this.getArea() == otherCircle.getArea();
    }

    @Override
    public String toString() {
        return "Circle { " +
                "radius=" + radius +
                ", area=" + getArea() +
                ", circumference=" + getCircumference() +
                " }";
    }
}
