package homework6.task13;
import java.util.ArrayList;
import java.util.List;

public class StringBuilderWithObserver {
    private StringBuilder delegate = new StringBuilder();
    private List<Observer> observers = new ArrayList<>();

    // Метод для добавления наблюдателей
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    // Метод для оповещения наблюдателей
    private void notifyObservers() {
        String data = delegate.toString();
        for (Observer observer : observers) {
            observer.onUpdate(data);
        }
    }

    // Делегируем метод append и добавляем оповещение
    public StringBuilderWithObserver append(String str) {
        delegate.append(str);
        notifyObservers();
        return this;
    }

    @Override
    public String toString() {
        return delegate.toString();
    }
}
