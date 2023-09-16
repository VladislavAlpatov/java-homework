package homework13.task1.task10;

public class SubstringExample {
    public static void main(String[] args) {
        String input = "I like Java!!!";

        // Находим начальный и конечный индексы подстроки "Java"
        int startIndex = input.indexOf("Java");
        int endIndex = startIndex + "Java".length();

        // Вырезаем подстроку "Java"
        String javaSubstring = input.substring(startIndex, endIndex);

        System.out.println("Исходная строка: " + input);
        System.out.println("Вырезанная подстрока: " + javaSubstring);
    }
}
