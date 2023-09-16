package homework4.task3;

import java.util.ArrayList;
import java.util.List;

public class Catalog {
    private String name;
    private List<Product> products;

    public Catalog(String name) {
        this.name = name;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public List<Product> getProducts() {
        return products;
    }
}
