package homework11.task2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateComparison {
    public static void main(String[] args) {
        // Получаем текущую дату
        LocalDate currentDate = LocalDate.now();

        // Ввод даты от пользователя
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите дату в формате ГГГГ-ММ-ДД (например, 2023-09-16): ");
        String userInput = scanner.nextLine();

        // Преобразовываем введенную строку в LocalDate
        LocalDate userDate = LocalDate.parse(userInput, DateTimeFormatter.ISO_LOCAL_DATE);

        // Сравниваем даты
        if (userDate.isEqual(currentDate)) {
            System.out.println("Введенная дата совпадает с текущей датой.");
        } else if (userDate.isBefore(currentDate)) {
            System.out.println("Введенная дата раньше текущей даты.");
        } else {
            System.out.println("Введенная дата позже текущей даты.");
        }

        // Закрываем сканнер
        scanner.close();
    }
}
