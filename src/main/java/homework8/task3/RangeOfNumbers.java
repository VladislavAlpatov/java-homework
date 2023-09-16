package homework8.task3;

import java.util.Scanner;

public class RangeOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число A: ");
        int A = scanner.nextInt();

        System.out.print("Введите число B: ");
        int B = scanner.nextInt();

        if (A < B) {
            System.out.println("Числа от " + A + " до " + B + " в порядке возрастания:");
            for (int i = A; i <= B; i++) {
                System.out.println(i);
            }
        } else if (A > B) {
            System.out.println("Числа от " + A + " до " + B + " в порядке убывания:");
            for (int i = A; i >= B; i--) {
                System.out.println(i);
            }
        } else {
            System.out.println("Числа равны: " + A);
        }

        scanner.close();
    }
}
