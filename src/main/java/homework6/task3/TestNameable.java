package homework6.task3;

public class TestNameable {
    public static void main(String[] args) {
        Nameable planet = new Planet("Mars");
        Nameable car = new Car("Tesla");
        Nameable animal = new Animal("Dog");

        System.out.println("Planet name: " + planet.getName());
        System.out.println("Car name: " + car.getName());
        System.out.println("Animal name: " + animal.getName());
    }
}
