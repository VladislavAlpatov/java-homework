package homework3.task3;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Создаем массив из 4 элементов
        int[] arr = new int[4];

        // Инициализируем массив случайными числами от 10 до 99
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(90) + 10;
        }

        // Выводим массив на экран
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Проверяем, является ли массив строго возрастающей последовательностью
        boolean isStrictlyIncreasing = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] <= arr[i - 1]) {
                isStrictlyIncreasing = false;
                break;
            }
        }

        // Выводим результат
        if (isStrictlyIncreasing) {
            System.out.println("Массив является строго возрастающей последовательностью.");
        } else {
            System.out.println("Массив не является строго возрастающей последовательностью.");
        }
    }
}

