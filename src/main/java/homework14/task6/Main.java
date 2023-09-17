package homework14.task6;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main {
    public static void main(String[] args) {
        // Регулярное выражение для проверки email согласно RFC 2822 (упрощенное)
        String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        Pattern pattern = Pattern.compile(regex);

        // Примеры email для проверки
        String[] emailSamples = {
                "user@example.com",
                "root@localhost",
                "myhost@@@com.ru",
                "@my.ru",
                "Julia String."
        };

        for (String email : emailSamples) {
            Matcher matcher = pattern.matcher(email);
            if (matcher.matches()) {
                System.out.println(email + " is a valid email address.");
            } else {
                System.out.println(email + " is NOT a valid email address.");
            }
        }
    }
}
