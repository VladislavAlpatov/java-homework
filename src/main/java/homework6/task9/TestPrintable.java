package homework6.task9;

import homework6.task6.Printable;
import homework6.task8.Shop;

import java.util.Arrays;
import java.util.List;

public class TestPrintable {
    public static void main(String[] args) {
        List<String> products = Arrays.asList("Apple", "Banana", "Cherry");
        Printable shop = new Shop("Fruit Shop", products);
        shop.print();
    }
}
