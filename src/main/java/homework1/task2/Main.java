package homework1.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        // Ввод массива с клавиатуры
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        // Считаем сумму с помощью цикла do-while
        int i = 0;
        do {
            sum += array[i];
            i++;
        } while (i < n);

        // Находим максимальный и минимальный элемент с помощью цикла while
        i = 0;
        while (i < n) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
            i++;
        }

        // Выводим результат
        System.out.println("Сумма элементов массива: " + sum);
        System.out.println("Максимальный элемент: " + max);
        System.out.println("Минимальный элемент: " + min);
    }
}
