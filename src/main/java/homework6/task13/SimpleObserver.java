package homework6.task13;

public class SimpleObserver implements Observer {
    @Override
    public void onUpdate(String newData) {
        System.out.println("The StringBuilder has been updated. New data: " + newData);
    }
}
