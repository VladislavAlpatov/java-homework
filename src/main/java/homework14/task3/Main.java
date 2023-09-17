package homework14.task3;

import java.util.regex.*;

public class Main {
    public static void main(String[] args) {
        String text = "Стоимость товара: 25.98 USD, 1500.00 RUB, 10.50 EU.";

        // Регулярное выражение для поиска цен
        String regex = "(\\d+\\.\\d{2}) (USD|RUB|EU)";

        // Создаем объект Pattern
        Pattern pattern = Pattern.compile(regex);

        // Создаем объект Matcher
        Matcher matcher = pattern.matcher(text);

        // Ищем и выводим цены в USD, RUB и EU
        while (matcher.find()) {
            String price = matcher.group(1);
            String currency = matcher.group(2);
            System.out.println("Цена: " + price + " " + currency);
        }
    }
}

