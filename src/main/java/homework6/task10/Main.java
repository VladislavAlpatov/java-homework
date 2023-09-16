package homework6.task10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of computers you want to add:");
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the brand (DELL, APPLE, HP, LENOVO):");
            ComputerBrand brand = ComputerBrand.valueOf(scanner.nextLine().toUpperCase());

            System.out.println("Enter the processor speed:");
            double speed = Double.parseDouble(scanner.nextLine());

            System.out.println("Enter the memory capacity:");
            int capacity = Integer.parseInt(scanner.nextLine());

            System.out.println("Enter the monitor size:");
            int size = Integer.parseInt(scanner.nextLine());

            Processor processor = new Processor("Intel", speed);
            Memory memory = new Memory(capacity);
            Monitor monitor = new Monitor(size);

            Computer computer = new Computer(brand, processor, memory, monitor);
            shop.addComputer(computer);
        }

        scanner.close();

        System.out.println("Computers in the shop:");
        shop.listComputers();
    }
}

