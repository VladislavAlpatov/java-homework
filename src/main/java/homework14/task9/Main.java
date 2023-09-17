package homework14.task9;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String text = "This is a simple example text for frequency analysis.";

        // Приведение всего текста к нижнему регистру для упрощения анализа
        text = text.toLowerCase();

        // Инициализация HashMap для хранения частот
        HashMap<Character, Integer> frequencyMap = new HashMap<>();

        // Проход по каждому символу в строке
        for (char c : text.toCharArray()) {
            // Проверка, является ли символ буквой алфавита
            if (Character.isLetter(c)) {
                frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
            }
        }

        // Вывод результатов
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            System.out.println("Letter: " + entry.getKey() + ", Frequency: " + entry.getValue());
        }
    }
}
