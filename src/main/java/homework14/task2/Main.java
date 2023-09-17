package homework14.task2;

import java.util.regex.*;

public class Main {
    public static void main(String[] args) {
        String input = "abcdefghijklmnopqrstuv18340";

        // Регулярное выражение для сравнения
        String regex = "^abcdefghijklmnopqrstuv18340$";

        // Создаем объект Pattern
        Pattern pattern = Pattern.compile(regex);

        // Создаем объект Matcher
        Matcher matcher = pattern.matcher(input);

        // Проверяем, соответствует ли строка регулярному выражению
        if (matcher.matches()) {
            System.out.println("Строка соответствует образцу.");
        } else {
            System.out.println("Строка не соответствует образцу.");
        }
    }
}

