package homework1.task4;

public class HarmonicSeries {
    public static void main(String[] args) {
        double sum = 0;

        // Форматированный вывод
        System.out.printf("%-12s%-12s%n", "Term", "Sum");

        for (int i = 1; i <= 10; i++) {
            sum += 1.0 / i;  // Добавить i-й член ряда к сумме
            System.out.printf("%-12d%-12.6f%n", i, sum);
        }
    }
}

