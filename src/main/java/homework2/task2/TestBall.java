package homework2.task2;

public class TestBall {
    public static void main(String[] args) {
        // Создаем объект класса Ball с начальными координатами (0, 0)
        Ball ball = new Ball(0, 0);

        // Устанавливаем новые координаты мяча
        ball.setPosition(2.5, 3.5);

        // Выводим текущие координаты мяча
        System.out.println("Current Position: (" + ball.getX() + ", " + ball.getY() + ")");

        // Перемещаем мяч на (1.0, -2.0) единицы
        ball.move(1.0, -2.0);

        // Выводим обновленные координаты мяча
        System.out.println("New Position: (" + ball.getX() + ", " + ball.getY() + ")");
    }
}
