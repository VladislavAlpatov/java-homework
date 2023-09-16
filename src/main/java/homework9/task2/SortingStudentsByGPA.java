package homework9.task2;

import java.util.Comparator;

class SortingStudentsByGPA implements Comparator<Student>
{
    // Метод для обмена элементов массива
    private void swap(Student[] students, int i, int j) {
        Student temp = students[i];
        students[i] = students[j];
        students[j] = temp;
    }

    // Метод для разбиения массива на две части
    private int partition(Student[] students, int low, int high) {
        double pivot = students[high].getGpa();
        int i = (low - 1);

        for (int j = low; j < high; j++) {
            if (students[j].getGpa() >= pivot) {
                i++;
                swap(students, i, j);
            }
        }

        swap(students, i + 1, high);
        return i + 1;
    }

    // Метод быстрой сортировки для массива студентов
    private void quickSort(Student[] students, int low, int high) {
        if (low < high) {
            int pi = partition(students, low, high);
            quickSort(students, low, pi - 1);
            quickSort(students, pi + 1, high);
        }
    }

    // Реализация метода compare интерфейса Comparator
    @Override
    public int compare(Student student1, Student student2) {
        // Сравниваем студентов по итоговым баллам в порядке убывания
        if (student1.getGpa() > student2.getGpa()) {
            return -1;
        } else if (student1.getGpa() < student2.getGpa()) {
            return 1;
        } else {
            return 0;
        }
    }

    // Метод для сортировки массива студентов
    public void sortStudentsByGPA(Student[] students) {
        int n = students.length;
        quickSort(students, 0, n - 1);
    }

    public static void main(String[] args) {
        Student[] students = {
                new Student("Alice", 3.8),
                new Student("Bob", 3.9),
                new Student("Charlie", 3.5),
                new Student("David", 4.0)
        };

        System.out.println("Неотсортированный список студентов:");
        for (Student student : students) {
            System.out.println(student);
        }

        SortingStudentsByGPA sorter = new SortingStudentsByGPA();
        sorter.sortStudentsByGPA(students);

        System.out.println("\nОтсортированный список студентов по GPA (по убыванию):");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}