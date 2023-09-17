package homework14.task1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class RegexStringSplitter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку для разбивки: ");
        String input = scanner.nextLine();
        System.out.print("Введите регулярное выражение: ");
        String regex = scanner.nextLine();

        // Создаем объект Pattern на основе введенного регулярного выражения
        Pattern pattern = Pattern.compile(regex);

        // Создаем объект Matcher для поиска совпадений в строке
        Matcher matcher = pattern.matcher(input);

        // Используем метод find() для поиска совпадений и разбивки строки
        while (matcher.find()) {
            // Выводим найденные элементы
            System.out.println("Найдено: " + matcher.group());
        }

        scanner.close();
    }
}
