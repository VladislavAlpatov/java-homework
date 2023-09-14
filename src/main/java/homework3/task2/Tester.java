package homework3.task2;
import java.util.Arrays;
import java.util.Random;

public class Tester {
    public Circle[] circles;
    public int count;

    public Tester(int size) {
        this.circles = new Circle[size];
        this.count = 0;
    }

    public void addCircle(Circle circle) {
        if (count < circles.length) {
            circles[count] = circle;
            count++;
        }
    }

    public Circle findSmallestCircle() {
        return Arrays.stream(circles, 0, count).min(Circle::compareTo).orElse(null);
    }

    public Circle findLargestCircle() {
        return Arrays.stream(circles, 0, count).max(Circle::compareTo).orElse(null);
    }

    public void sortCircles() {
        Arrays.sort(circles, 0, count);
    }

    public static void main(String[] args) {
        // Использование класса Random для генерации случайных чисел
        Random random = new Random();

        Tester tester = new Tester(5);

        for (int i = 0; i < 5; i++) {
            Point center = new Point(random.nextDouble() * 10, random.nextDouble() * 10);
            double radius = random.nextDouble() * 10;
            tester.addCircle(new Circle(center, radius));
        }

        Circle smallest = tester.findSmallestCircle();
        System.out.println("Самая маленькая окружность имеет радиус: " + smallest.radius);

        Circle largest = tester.findLargestCircle();
        System.out.println("Самая большая окружность имеет радиус: " + largest.radius);

        tester.sortCircles();
        System.out.println("Окружности отсортированы по радиусу.");
    }
}