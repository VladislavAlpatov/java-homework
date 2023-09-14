package homework3.string_formating;

public class Main {
    public static void main(String[] args) {
        // Задание 1 и 2
        CurrencyConverter converter = new CurrencyConverter(0.85); // USD to EUR rate
        OnlineStore store = new OnlineStore(converter);
        store.printTotalCost(100);  // Total cost in USD and EUR

        // Задание 3
        Employee[] employees = new Employee[] {
                new Employee("Alice", 50000),
                new Employee("Bob", 60000),
                new Employee("Charlie", 70000)
        };
        Report.generateReport(employees);
    }
}

