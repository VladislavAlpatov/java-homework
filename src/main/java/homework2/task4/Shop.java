package homework2.task4;

import java.util.ArrayList;

public class Shop {
    private ArrayList<Computer> computers;

    public Shop() {
        this.computers = new ArrayList<>();
    }

    public void addComputer(Computer computer) {
        computers.add(computer);
    }

    public void removeComputer(Computer computer) {
        computers.remove(computer);
    }

    public ArrayList<Computer> searchComputers(String brand) {
        ArrayList<Computer> results = new ArrayList<>();
        for (Computer computer : computers) {
            if (computer.getBrand().equalsIgnoreCase(brand)) {
                results.add(computer);
            }
        }
        return results;
    }

    @Override
    public String toString() {
        return "Shop { " +
                "computers=" + computers +
                " }";
    }
}

