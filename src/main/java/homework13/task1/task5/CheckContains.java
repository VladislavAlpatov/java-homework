package homework13.task1.task5;

public class CheckContains {
    public static void main(String[] args) {
        String input = "I like Java!!!";

        // Проверяем, содержит ли строка "Java"
        boolean containsJava = input.contains("Java");

        if (containsJava) {
            System.out.println("Строка содержит 'Java'.");
        } else {
            System.out.println("Строка не содержит 'Java'.");
        }
    }
}
