package homework6.task4;

public class House implements Priceable {
    private double price;

    public House(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
