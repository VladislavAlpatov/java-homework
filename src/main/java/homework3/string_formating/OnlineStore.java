package homework3.string_formating;

public class OnlineStore {
    private CurrencyConverter converter;

    public OnlineStore(CurrencyConverter converter) {
        this.converter = converter;
    }

    public void printTotalCost(double cost) {
        System.out.printf("Total cost in original currency: %.2f%n", cost);
        System.out.printf("Total cost in converted currency: %.2f%n", converter.convert(cost));
    }
}
