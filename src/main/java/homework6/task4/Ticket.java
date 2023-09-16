package homework6.task4;

public class Ticket implements Priceable {
    private double price;

    public Ticket(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
