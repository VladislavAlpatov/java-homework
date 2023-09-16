package homework13.task1.task4;

public class CheckStarting {
    public static void main(String[] args) {
        String input = "I like Java!!!";

        // Проверяем, начинается ли строка с "I like"
        boolean startsWithILike = input.startsWith("I like");

        if (startsWithILike) {
            System.out.println("Строка начинается с 'I like'.");
        } else {
            System.out.println("Строка не начинается с 'I like'.");
        }
    }
}
