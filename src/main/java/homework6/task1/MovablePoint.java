package homework6.task1;


public class MovablePoint implements Movable {
    private int x;
    private int y;
    private int xSpeed;
    private int ySpeed;

    // Конструктор
    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    // Реализация методов интерфейса Movable
    @Override
    public void moveUp() {
        this.y += ySpeed;
    }

    @Override
    public void moveDown() {
        this.y -= ySpeed;
    }

    @Override
    public void moveLeft() {
        this.x -= xSpeed;
    }

    @Override
    public void moveRight() {
        this.x += xSpeed;
    }

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