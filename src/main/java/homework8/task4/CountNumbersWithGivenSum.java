package homework8.task4;

public class CountNumbersWithGivenSum {
    // Функция для подсчета k-значных чисел с суммой цифр равной d
    public static int countNumbers(int k, int s) {
        // Базовый случай: если k равно 1, то есть однозначные числа,
        // то сумма цифр равна s, и есть только одно такое число.
        if (k == 1 && s >= 0 && s <= 9) {
            return 1;
        }

        // Если k больше 1, то сумма цифр не может быть больше 9*k или меньше 0,
        // иначе нет таких чисел.
        if (s < 0 || s > 9 * k) {
            return 0;
        }

        // Рекурсивно вызываем функцию для всех возможных первых десяти цифр
        int count = 0;
        for (int i = 0; i <= 9; i++) {
            count += countNumbers(k - 1, s - i);
        }

        return count;
    }

    public static void main(String[] args) {
        int k = 3; // Количество цифр
        int s = 15; // Сумма цифр

        int result = countNumbers(k, s);
        System.out.println("Количество " + k + "-значных чисел с суммой цифр " + s + ": " + result);
    }
}
