package homework4_1.task1;

public abstract class Shape {
    public abstract String getType();
    public abstract double getArea();
    public abstract double getPerimeter();

    @Override
    public String toString() {
        return "Type: " + getType() + ", Area: " + getArea() + ", Perimeter: " + getPerimeter();
    }
}
