package homework6.task10;

import java.util.ArrayList;

public class Shop {
    private ArrayList<Computer> computers = new ArrayList<>();

    public void addComputer(Computer computer) {
        computers.add(computer);
    }

    public void removeComputer(Computer computer) {
        computers.remove(computer);
    }

    public Computer findComputerByBrand(ComputerBrand brand) {
        for (Computer computer : computers) {
            if (computer.getBrand() == brand) {
                return computer;
            }
        }
        return null;
    }

    public void listComputers() {
        for (Computer computer : computers) {
            System.out.println(computer);
        }
    }
}
