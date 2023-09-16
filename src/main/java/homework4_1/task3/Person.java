package homework4_1.task3;

public class Person {
    private String fullName;
    private int age;

    // Конструктор без параметров
    public Person() {
    }

    // Конструктор с параметрами
    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    // Метод для движения
    public void move() {
        System.out.println(fullName + " движется");
    }

    // Метод для разговора
    public void talk() {
        System.out.println(fullName + " говорит");
    }

    public static void main(String[] args) {
        // Создание объекта с помощью конструктора без параметров
        Person person1 = new Person();
        person1.fullName = "John Doe";
        person1.age = 30;

        // Создание объекта с помощью конструктора с параметрами
        Person person2 = new Person("Jane Doe", 25);

        // Вызов методов для первого объекта
        person1.move();
        person1.talk();

        // Вызов методов для второго объекта
        person2.move();
        person2.talk();
    }
}
