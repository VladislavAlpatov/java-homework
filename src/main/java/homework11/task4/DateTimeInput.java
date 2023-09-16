package homework11.task4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DateTimeInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Получаем данные от пользователя
        System.out.print("Введите год: ");
        int year = scanner.nextInt();

        System.out.print("Введите месяц (1-12): ");
        int month = scanner.nextInt();

        System.out.print("Введите число (1-31): ");
        int day = scanner.nextInt();

        System.out.print("Введите часы (0-23): ");
        int hours = scanner.nextInt();

        System.out.print("Введите минуты (0-59): ");
        int minutes = scanner.nextInt();

        // Создаем объект Date на основе введенных данных
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        String dateStr = String.format("%04d-%02d-%02d %02d:%02d", year, month, day, hours, minutes);

        Date date = null;
        try {
            date = dateFormat.parse(dateStr);
        } catch (ParseException e) {
            System.out.println("Ошибка при парсинге даты.");
            e.printStackTrace();
        }

        if (date != null) {
            System.out.println("Созданный объект Date: " + date);
        }

        // Создаем объект Calendar на основе введенных данных
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month - 1); // Месяцы в Calendar начинаются с 0
        calendar.set(Calendar.DAY_OF_MONTH, day);
        calendar.set(Calendar.HOUR_OF_DAY, hours);
        calendar.set(Calendar.MINUTE, minutes);

        System.out.println("Созданный объект Calendar: " + calendar.getTime());

        // Закрываем сканнер
        scanner.close();
    }
}
