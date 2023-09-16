package homework9.task4;

// Создаем свой собственный интерфейс MyComparable
interface MyComparable<T> {
    int compareTo(T other);
}

// Класс Person реализует интерфейс MyComparable
class Person implements MyComparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Реализуем метод compareTo для сравнения объектов Person по возрасту
    @Override
    public int compareTo(Person otherPerson) {
        if (this.age < otherPerson.age) {
            return -1;
        } else if (this.age > otherPerson.age) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        Person person1 = new Person("Alice", 25);
        Person person2 = new Person("Bob", 30);

        int comparisonResult = person1.compareTo(person2);

        if (comparisonResult < 0) {
            System.out.println(person1.getName() + " младше чем " + person2.getName());
        } else if (comparisonResult > 0) {
            System.out.println(person1.getName() + " старше чем " + person2.getName());
        } else {
            System.out.println(person1.getName() + " и " + person2.getName() + " одного возраста");
        }
    }
}

