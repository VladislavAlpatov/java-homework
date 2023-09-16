package homework4.task3;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Product> products;

    public Cart() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void checkout() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        System.out.println("Total: " + total);
        products.clear();
    }
}
