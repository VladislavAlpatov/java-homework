package homework14.task5;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main {
    public static void main(String[] args) {
        // Регулярное выражение для проверки даты
        String regex = "^(0[1-9]|[12][0-9]|3[01])\\/(0[1-9]|1[0-2])\\/(19[0-9]{2}|[2-9][0-9]{3})$";
        Pattern pattern = Pattern.compile(regex);

        // Примеры строк для проверки
        String[] dateSamples = {
                "01/01/1900",
                "15/10/2020",
                "29/02/2400",
                "31/12/9999",
                "32/12/9999",  // Некорректная дата
                "15-10-2020"   // Некорректный формат
        };

        for (String date : dateSamples) {
            Matcher matcher = pattern.matcher(date);
            if (matcher.matches()) {
                System.out.println(date + " is a valid date.");
            } else {
                System.out.println(date + " is NOT a valid date.");
            }
        }
    }
}
