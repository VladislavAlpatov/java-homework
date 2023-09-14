package homework3.task4;

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        // Проверка ввода
        do {
            System.out.println("Введите натуральное число больше 0:");
            while (!scanner.hasNextInt()) {
                System.out.println("Это не число. Попробуйте еще раз:");
                scanner.next();
            }
            n = scanner.nextInt();
        } while (n <= 0);

        // Создание и заполнение первого массива
        int[] arr = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(n + 1);
        }

        // Вывод первого массива
        System.out.print("Первый массив: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Создание и заполнение второго массива
        int evenCount = 0;
        for (int i : arr) {
            if (i % 2 == 0) evenCount++;
        }

        if (evenCount == 0) {
            System.out.println("В массиве нет четных чисел.");
            return;
        }

        int[] evenArr = new int[evenCount];
        int index = 0;
        for (int i : arr) {
            if (i % 2 == 0) {
                evenArr[index++] = i;
            }
        }

        // Вывод второго массива
        System.out.print("Второй массив: ");
        for (int i : evenArr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

