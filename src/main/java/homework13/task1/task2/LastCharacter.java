package homework13.task1.task2;

public class LastCharacter {
    public static void main(String[] args) {
        String input = "I like Java!!!";

        // Получаем длину строки
        int length = input.length();

        if (length > 0) {
            // Получаем последний символ с помощью charAt
            char lastChar = input.charAt(length - 1);
            System.out.println("Последний символ строки: " + lastChar);
        } else {
            System.out.println("Строка пуста.");
        }
    }
}
