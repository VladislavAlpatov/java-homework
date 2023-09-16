package homework9.task3;

import homework9.task2.Student;

import java.util.ArrayList;
import java.util.List;

public class MergeSortStudents {
    // Метод для сортировки списка студентов слиянием
    public static List<Student> mergeSort(List<Student> list) {
        int n = list.size();
        if (n <= 1) {
            return list;
        }

        int middle = n / 2;
        List<Student> left = new ArrayList<>(list.subList(0, middle));
        List<Student> right = new ArrayList<>(list.subList(middle, n));

        left = mergeSort(left);
        right = mergeSort(right);

        return merge(left, right);
    }

    // Метод для слияния двух списков студентов
    private static List<Student> merge(List<Student> left, List<Student> right) {
        List<Student> result = new ArrayList<>();
        int i = 0, j = 0;

        while (i < left.size() && j < right.size()) {
            if (left.get(i).getGpa() >= right.get(j).getGpa()) {
                result.add(left.get(i));
                i++;
            } else {
                result.add(right.get(j));
                j++;
            }
        }

        result.addAll(left.subList(i, left.size()));
        result.addAll(right.subList(j, right.size()));

        return result;
    }

    public static void main(String[] args) {
        List<Student> students1 = new ArrayList<>();
        students1.add(new Student("Alice", 3.8));
        students1.add(new Student("Bob", 3.9));
        students1.add(new Student("Charlie", 3.5));

        List<Student> students2 = new ArrayList<>();
        students2.add(new Student("David", 4.0));
        students2.add(new Student("Eva", 3.7));

        System.out.println("Список студентов 1:");
        for (Student student : students1) {
            System.out.println(student);
        }

        System.out.println("\nСписок студентов 2:");
        for (Student student : students2) {
            System.out.println(student);
        }

        List<Student> mergedStudents = new ArrayList<>(students1);
        mergedStudents.addAll(students2);

        // Сортируем объединенный список с использованием алгоритма сортировки слиянием
        mergedStudents = mergeSort(mergedStudents);

        System.out.println("\nОтсортированный объединенный список студентов:");
        for (Student student : mergedStudents) {
            System.out.println(student);
        }
    }
}