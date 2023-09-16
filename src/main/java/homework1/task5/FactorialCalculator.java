package homework1.task5;

public class FactorialCalculator {

    // Метод для вычисления факториала
    public static long factorial(int n) {
        long result = 1;

        // Используем цикл для вычисления факториала
        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        return result;
    }

    public static void main(String[] args) {
        // Проверяем работу метода
        System.out.println("Факториал 5 = " + factorial(5));  // Должно быть 120
        System.out.println("Факториал 10 = " + factorial(10));  // Должно быть 3_628_800
        System.out.println("Факториал 0 = " + factorial(0));  // Должно быть 1
    }
}
