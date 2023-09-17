package homework14.task7;

import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        // Примеры паролей для проверки
        String[] passwords = {
                "F032_Password",
                "TrySpy1",
                "smart_pass",
                "A007"
        };

        for (String password : passwords) {
            if (isValidPassword(password)) {
                System.out.println(password + " is a valid password.");
            } else {
                System.out.println(password + " is NOT a valid password.");
            }
        }
    }

    public static boolean isValidPassword(String password) {
        // Регулярное выражение для проверки пароля
        String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[_])[A-Za-z0-9_]{8,}$";

        return Pattern.matches(regex, password);
    }
}
