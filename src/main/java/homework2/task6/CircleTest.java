package homework2.task6;

public class CircleTest {
    public static void main(String[] args) {
        // Создаем окружности
        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle(10);
        Circle circle3 = new Circle(5);

        // Выводим информацию о них
        System.out.println("Circle 1: " + circle1);
        System.out.println("Circle 2: " + circle2);
        System.out.println("Circle 3: " + circle3);

        // Сравниваем окружности
        System.out.println("Is circle1 equal to circle2? " + circle1.equals(circle2));
        System.out.println("Is circle1 equal to circle3? " + circle1.equals(circle3));
    }
}
