package homework13.task1.task3;

public class CheckEnding {
    public static void main(String[] args) {
        String input = "I like Java!!!";

        // Проверяем, заканчивается ли строка на "!!!"
        boolean endsWithExclamation = input.endsWith("!!!");

        if (endsWithExclamation) {
            System.out.println("Строка заканчивается на '!!!'.");
        } else {
            System.out.println("Строка не заканчивается на '!!!'.");
        }
    }
}
