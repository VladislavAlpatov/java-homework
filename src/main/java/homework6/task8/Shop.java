package homework6.task8;

import homework6.task6.Printable;

import java.util.List;

public class Shop implements Printable
{
    private String name;
    private List<String> products;

    public Shop(String name, List<String> products) {
        this.name = name;
        this.products = products;
    }

    @Override
    public void print() {
        System.out.println("Printing shop details:");
        System.out.println("Shop Name: " + name);
        System.out.println("Available Products:");
        for (String product : products) {
            System.out.println(" - " + product);
        }
    }
}
