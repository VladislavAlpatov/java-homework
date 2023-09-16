package homework4.task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Аутентификация
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        User user = new User("admin", "password");

        if (!user.getUsername().equals(username) || !user.checkPassword(password)) {
            System.out.println("Invalid credentials");
            return;
        }

        // Создаем каталог и товары
        Catalog electronics = new Catalog("Electronics");
        electronics.addProduct(new Product("Laptop", 1000));
        electronics.addProduct(new Product("Phone", 500));

        // Создаем корзину
        Cart cart = new Cart();

        // Показываем товары
        System.out.println("Products:");
        for (Product product : electronics.getProducts()) {
            System.out.println(product.getName() + " - $" + product.getPrice());
        }

        // Добавляем в корзину
        System.out.print("Which product to add to cart? ");
        String productName = scanner.nextLine();

        for (Product product : electronics.getProducts()) {
            if (product.getName().equalsIgnoreCase(productName)) {
                cart.addProduct(product);
                System.out.println(product.getName() + " added to cart.");
            }
        }

        // Покупка
        System.out.println("Proceed to checkout? (yes/no)");
        String proceed = scanner.nextLine();
        if ("yes".equalsIgnoreCase(proceed)) {
            cart.checkout();
        }
    }
}
