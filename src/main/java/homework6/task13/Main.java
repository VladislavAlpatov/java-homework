package homework6.task13;

public class Main {
    public static void main(String[] args) {
        StringBuilderWithObserver stringBuilder = new StringBuilderWithObserver();

        // Добавляем наблюдателя
        stringBuilder.addObserver(new SimpleObserver());

        stringBuilder.append("Hello, ");
        stringBuilder.append("world!");
    }
}
