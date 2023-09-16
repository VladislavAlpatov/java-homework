package homework13.task6;

import java.io.*;
import java.util.*;

public class WordChain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя файла: ");
        String fileName = scanner.nextLine();
        scanner.close();

        try {
            String result = getLine(fileName);
            System.out.println("Результат: " + result);
        } catch (IOException e) {
            System.err.println("Ошибка чтения файла: " + e.getMessage());
        }
    }

    public static String getLine(String fileName) throws IOException {
        // Считываем слова из файла
        List<String> words = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] wordArray = line.split(" ");
                words.addAll(Arrays.asList(wordArray));
            }
        }

        // Используем StringBuilder для формирования строки
        StringBuilder result = new StringBuilder();
        if (!words.isEmpty()) {
            result.append(words.get(0));
            words.remove(0);

            while (!words.isEmpty()) {
                boolean found = false;
                for (int i = 0; i < words.size(); i++) {
                    String currentWord = words.get(i);
                    if (Character.toLowerCase(result.charAt(result.length() - 1)) ==
                            Character.toLowerCase(currentWord.charAt(0))) {
                        result.append(" ").append(currentWord);
                        words.remove(i);
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    break; // Если не удалось найти подходящее слово, завершаем процесс
                }
            }
        }

        return result.toString();
    }
}
