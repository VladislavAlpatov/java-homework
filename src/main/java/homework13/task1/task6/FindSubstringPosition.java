package homework13.task1.task6;

public class FindSubstringPosition {
    public static void main(String[] args) {
        String input = "I like Java!!!";

        // Находим позицию подстроки "Java"
        int position = input.indexOf("Java");

        if (position != -1) {
            System.out.println("Позиция подстроки 'Java' в строке: " + position);
        } else {
            System.out.println("Подстрока 'Java' не найдена в строке.");
        }
    }
}