package homework13.task1.task7;

public class ReplaceCharacters {
    public static void main(String[] args) {
        String input = "I like Java!!!";

        // Заменяем все символы "а" на "о"
        String replacedString = input.replace("a", "o");

        System.out.println("Исходная строка: " + input);
        System.out.println("Строка после замены: " + replacedString);
    }
}
