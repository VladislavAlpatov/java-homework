package homework6.task1;

public class MovableCircle implements Movable {
    private MovablePoint center;
    private int radius;

    // Constructor
    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    // Implement the methods of the Movable interface

    @Override
    public void MoveUp() {
        center.MoveUp();
    }

    @Override
    public void MoveDown() {
        center.MoveDown();
    }

    @Override
    public void MoveLeft() {
        center.MoveLeft();
    }

    @Override
    public void MoveRight() {
        center.MoveRight();
    }

    // Additional method to print position and radius of the circle
    @Override
    public String toString() {
        return this.radius + this.center.toString();
    }

    // You could also add getters and setters for the 'center' and 'radius' if needed
}
