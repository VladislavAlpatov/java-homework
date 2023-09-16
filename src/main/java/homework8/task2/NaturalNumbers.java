package homework8.task2;

import java.util.Scanner;

public class NaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите натуральное число n: ");
        int n = scanner.nextInt();

        if (n < 1) {
            System.out.println("Пожалуйста, введите натуральное число (больше или равно 1).");
        } else {
            System.out.println("Все натуральные числа от 1 до " + n + ":");
            for (int i = 1; i <= n; i++) {
                System.out.println(i);
            }
        }

        scanner.close();
    }
}
