package homework14.task8;

import java.util.ArrayList;

interface Filter {
    boolean apply(Object o);
}

public class Main {
    public static void main(String[] args) {
        // Пример использования на массиве строк
        String[] strings = {"apple", "banana", "", "cherry", null, "date"};

        // Реализация интерфейса Filter для строк, которая отфильтровывает пустые строки и null
        Filter stringFilter = new Filter() {
            @Override
            public boolean apply(Object o) {
                return o != null && !((String) o).isEmpty();
            }
        };

        Object[] filteredStrings = filter(strings, stringFilter);

        System.out.println("Filtered strings:");
        for (Object s : filteredStrings) {
            System.out.println(s);
        }

        // Пример использования на массиве чисел
        Integer[] numbers = {1, -2, 0, 4, -5, 6};

        // Реализация интерфейса Filter для чисел, которая отфильтровывает отрицательные числа и нули
        Filter numberFilter = new Filter() {
            @Override
            public boolean apply(Object o) {
                return o != null && (Integer) o > 0;
            }
        };

        Object[] filteredNumbers = filter(numbers, numberFilter);

        System.out.println("Filtered numbers:");
        for (Object n : filteredNumbers) {
            System.out.println(n);
        }
    }

    public static Object[] filter(Object[] array, Filter filter) {
        ArrayList<Object> resultList = new ArrayList<>();

        for (Object o : array) {
            if (filter.apply(o)) {
                resultList.add(o);
            }
        }

        return resultList.toArray();
    }
}
