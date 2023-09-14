package homework2.task3;

public class Tester {
    private Circle[] circles; // Массив объектов Circle
    private int count; // Количество элементов в массиве

    public Tester(int size) {
        circles = new Circle[size];
        count = 0;
    }

    public void addCircle(Circle circle) {
        if (count < circles.length) {
            circles[count] = circle;
            count++;
        } else {
            System.out.println("Массив полон, невозможно добавить больше окружностей.");
        }
    }

    public int getCount() {
        return count;
    }
}