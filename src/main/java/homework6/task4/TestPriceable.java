package homework6.task4;

public class TestPriceable {
    public static void main(String[] args) {
        Priceable product = new Product(15.99);
        Priceable house = new House(250000.00);
        Priceable ticket = new Ticket(60.50);

        System.out.println("Product price: $" + product.getPrice());
        System.out.println("House price: $" + house.getPrice());
        System.out.println("Ticket price: $" + ticket.getPrice());
    }
}
