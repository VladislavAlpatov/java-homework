package homework2.task10;

import java.util.Scanner;

public class HowMany {
    public static void main(String[] args) {
        // Инициализация Scanner для чтения ввода с консоли
        Scanner scanner = new Scanner(System.in);

        // Запрос на ввод строки
        System.out.println("Введите строку: ");

        // Чтение введенной строки
        String input = scanner.nextLine();

        // Закрыть сканер, так как он больше не нужен
        scanner.close();

        // Разделение строки на слова
        String[] words = input.split("\\s+");

        // Определение и вывод количества слов
        int wordCount = words.length;
        System.out.println("Вы ввели " + wordCount + " слов(а).");
    }
}
