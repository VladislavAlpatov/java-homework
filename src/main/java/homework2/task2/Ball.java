package homework2.task2;

public class Ball {
    private double x;
    private double y;

    // Конструктор класса Ball
    public Ball(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Геттеры и сеттеры для полей x и y
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    // Метод для перемещения мяча на заданные координаты
    public void move(double deltaX, double deltaY) {
        x += deltaX;
        y += deltaY;
    }

    // Метод для одновременной установки полей x и y
    public void setPosition(double newX, double newY) {
        x = newX;
        y = newY;
    }
}
