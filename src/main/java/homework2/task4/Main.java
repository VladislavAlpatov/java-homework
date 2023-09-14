package homework2.task4;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();
        Scanner scanner = new Scanner(System.in);

        // Добавление компьютеров
        System.out.println("Сколько компьютеров вы хотите добавить?");
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.println("Введите бренд компьютера:");
            String brand = scanner.nextLine();
            System.out.println("Введите модель компьютера:");
            String model = scanner.nextLine();
            System.out.println("Введите цену компьютера:");
            double price = Double.parseDouble(scanner.nextLine());
            shop.addComputer(new Computer(brand, model, price));
        }

        // Поиск
        System.out.println("Введите бренд для поиска:");
        String searchBrand = scanner.nextLine();
        ArrayList<Computer> results = shop.searchComputers(searchBrand);
        System.out.println("Найденные компьютеры: " + results);

        scanner.close();
    }
}
