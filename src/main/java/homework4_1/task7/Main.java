package homework4_1.task7;

class Learner {
    String name;
    int age;

    public Learner(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Учащийся: " + name + ", возраст: " + age);
    }
}

class SchoolKid extends Learner {
    String grade; // класс в школе

    public SchoolKid(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    @Override
    public void display() {
        System.out.println("Школьник: " + name + ", возраст: " + age + ", класс: " + grade);
    }
}

class Student extends Learner {
    String major; // специальность в университете

    public Student(String name, int age, String major) {
        super(name, age);
        this.major = major;
    }

    @Override
    public void display() {
        System.out.println("Студент: " + name + ", возраст: " + age + ", специальность: " + major);
    }
}

public class Main {
    public static void main(String[] args) {
        Learner[] learners = new Learner[4];

        // Заполняем массив объектами
        learners[0] = new SchoolKid("Alice", 10, "4th Grade");
        learners[1] = new SchoolKid("Bob", 12, "6th Grade");
        learners[2] = new Student("Charlie", 20, "Computer Science");
        learners[3] = new Student("Dave", 22, "Mechanical Engineering");

        // Выводим всех учащихся
        for (Learner learner : learners) {
            learner.display();
        }

        // Выводим только школьников и студентов
        System.out.println("\nТолько школьники:");
        for (Learner learner : learners) {
            if (learner instanceof SchoolKid) {
                learner.display();
            }
        }

        System.out.println("\nТолько студенты:");
        for (Learner learner : learners) {
            if (learner instanceof Student) {
                learner.display();
            }
        }
    }
}

