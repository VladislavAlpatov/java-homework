package homework10.task2;

import homework10.task1.Student;

import java.util.Arrays;
import java.util.Comparator;

public class SortingStudentsByGPA {
    private Student[] iDNumber;

    public void setArray(Student[] students) {
        this.iDNumber = students;
    }

    public void quickSort(Comparator<Student> comparator) {
        Arrays.sort(iDNumber, comparator);
    }

    public void outArray() {
        for (Student student : iDNumber) {
            System.out.println(student);
        }
    }

    public static void main(String[] args) {
        Student[] students = {
                new Student("Alice", "Smith", "Computer Science", 2, "CS101", 3.1),
                new Student("Bob", "Johnson", "Mathematics", 3, "Math201", 2),
                new Student("Charlie", "Brown", "Physics", 1, "Phys101", 7),
                new Student("David", "Lee", "Chemistry", 4, "Chem301", 4)
        };

        SortingStudentsByGPA sorter = new SortingStudentsByGPA();
        sorter.setArray(students);

        System.out.println("Unsorted list of students:");
        sorter.outArray();

        // Sorting by GPA in descending order
        sorter.quickSort((student1, student2) -> Double.compare(student2.getGpa(), student1.getGpa()));

        System.out.println("\nSorted list of students by GPA (descending order):");
        sorter.outArray();

        // Sorting by last name in alphabetical order
        sorter.quickSort(Comparator.comparing(Student::getLastName));

        System.out.println("\nSorted list of students by last name (ascending order):");
        sorter.outArray();
    }
}
