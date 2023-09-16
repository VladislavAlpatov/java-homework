package homework9.task1;

public class StudentSortTest {
    // Метод сортировки вставками для массива объектов Student по полю iDNumber
    public static void insertionSort(Student[] students) {
        int n = students.length;
        for (int i = 1; i < n; i++) {
            Student key = students[i];
            int j = i - 1;
            while (j >= 0 && students[j].getiDNumber() > key.getiDNumber()) {
                students[j + 1] = students[j];
                j = j - 1;
            }
            students[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        Student[] students = {
                new Student(102, "Alice"),
                new Student(101, "Bob"),
                new Student(103, "Charlie"),
                new Student(100, "David")
        };

        System.out.println("Неотсортированный массив студентов:");
        for (Student student : students) {
            System.out.println(student);
        }

        insertionSort(students);

        System.out.println("\nОтсортированный массив студентов по iDNumber:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}