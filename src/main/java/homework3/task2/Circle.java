package homework3.task2;

class Circle implements Comparable<Circle> {
    public Point center;
    public double radius;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    @Override
    public int compareTo(Circle other) {
        return Double.compare(this.radius, other.radius);
    }
}