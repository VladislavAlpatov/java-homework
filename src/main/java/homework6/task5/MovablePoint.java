package homework6.task5;


public class MovablePoint implements Movable
{
    private int x;
    private int y;
    public int xSpeed;
    public int ySpeed;

    // Конструктор
    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    // Реализация методов интерфейса Movable

    // Метод для вывода текущей позиции (не указан в интерфейсе)
    public void printPosition() {
        System.out.println("Point position: (" + x + ", " + y + ")");
    }

    @Override
    public void MoveUp() {
        this.y += ySpeed;
    }

    @Override
    public void MoveDown() {
        this.y -= ySpeed;
    }

    @Override
    public void MoveLeft() {
        this.x -= xSpeed;
    }

    @Override
    public void MoveRight() {
        this.x += xSpeed;
    }
}