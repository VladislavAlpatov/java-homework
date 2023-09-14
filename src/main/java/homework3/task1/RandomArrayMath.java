package homework3.task1;

import java.util.Arrays;

public class RandomArrayMath {
    public static void main(String[] args) {
        // Инициализация массива
        double[] arr = new double[10];

        // Заполнение массива случайными числами
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.random();
        }

        // Вывод исходного массива
        System.out.println("Исходный массив: " + Arrays.toString(arr));

        // Сортировка массива
        Arrays.sort(arr);

        // Вывод отсортированного массива
        System.out.println("Отсортированный массив: " + Arrays.toString(arr));
    }
}
