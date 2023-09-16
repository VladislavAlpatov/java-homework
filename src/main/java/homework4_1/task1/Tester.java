package homework4_1.task1;

public class Tester {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 5);
        Shape square = new Square(4);

        System.out.println(circle);
        System.out.println(rectangle);
        System.out.println(square);
    }
}
