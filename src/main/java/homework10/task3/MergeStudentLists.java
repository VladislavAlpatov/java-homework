package homework10.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MergeStudentLists {
    public static void main(String[] args) {
        // Создаем два списка студентов
        List<Student> studentList1 = new ArrayList<>();
        studentList1.add(new Student("Alice", "Smith", "Computer Science", 2, "CS101"));
        studentList1.add(new Student("Bob", "Johnson", "Mathematics", 3, "Math201"));

        List<Student> studentList2 = new ArrayList<>();
        studentList2.add(new Student("Charlie", "Brown", "Physics", 1, "Phys101"));
        studentList2.add(new Student("David", "Lee", "Chemistry", 4, "Chem301"));

        // Создаем новый список и добавляем в него элементы из обоих списков
        List<Student> mergedStudentList = new ArrayList<>();
        mergedStudentList.addAll(studentList1);
        mergedStudentList.addAll(studentList2);

        // Сортируем объединенный список по какому-либо критерию (например, по имени)
        Collections.sort(mergedStudentList, Comparator.comparing(Student::getLastName));

        // Выводим отсортированный список
        for (Student student : mergedStudentList) {
            System.out.println(student);
        }
    }
}

class Student {
    private String firstName;
    private String lastName;
    private String specialty;
    private int course;
    private String group;

    public Student(String firstName, String lastName, String specialty, int course, String group) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.specialty = specialty;
        this.course = course;
        this.group = group;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSpecialty() {
        return specialty;
    }

    public int getCourse() {
        return course;
    }

    public String getGroup() {
        return group;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", specialty='" + specialty + '\'' +
                ", course=" + course +
                ", group='" + group + '\'' +
                '}';
    }
}
