package homework2.task3;

public class Main {
    public static void main(String[] args) {
        Point center1 = new Point(1.0, 2.0);
        Circle circle1 = new Circle(center1, 3.0);

        Point center2 = new Point(4.0, 5.0);
        Circle circle2 = new Circle(center2, 2.5);

        Tester tester = new Tester(2);
        tester.addCircle(circle1);
        tester.addCircle(circle2);

        System.out.println("Количество окружностей: " + tester.getCount());
    }
}