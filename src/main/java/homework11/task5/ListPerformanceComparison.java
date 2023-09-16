package homework11.task5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ListPerformanceComparison {
    public static void main(String[] args) {
        int n = 100000; // Количество элементов в списках
        Random random = new Random();

        // Создание и заполнение ArrayList случайными числами
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arrayList.add(random.nextInt());
        }

        // Создание и заполнение LinkedList случайными числами
        List<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            linkedList.add(random.nextInt());
        }

        // Измерение времени выполнения операций для ArrayList
        long startTime = System.currentTimeMillis();

        // Производим операции для ArrayList
        // Вставка элемента в середину списка
        arrayList.add(n / 2, 0);

        // Удаление элемента из середины списка
        arrayList.remove(n / 2);

        // Добавление элемента в конец списка
        arrayList.add(n);

        // Поиск элемента по образцу
        int searchElement = random.nextInt();
        arrayList.contains(searchElement);

        long endTime = System.currentTimeMillis();
        System.out.println("Время выполнения операций для ArrayList: " + (endTime - startTime) + " мс");

        // Измерение времени выполнения операций для LinkedList
        startTime = System.currentTimeMillis();

        // Производим операции для LinkedList
        // Вставка элемента в середину списка
        linkedList.add(n / 2, 0);

        // Удаление элемента из середины списка
        linkedList.remove(n / 2);

        // Добавление элемента в конец списка
        linkedList.add(n);

        // Поиск элемента по образцу
        linkedList.contains(searchElement);

        endTime = System.currentTimeMillis();
        System.out.println("Время выполнения операций для LinkedList: " + (endTime - startTime) + " мс");
    }
}
