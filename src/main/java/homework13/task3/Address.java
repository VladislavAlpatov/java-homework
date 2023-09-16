package homework13.task3;

public class Address {
    private String country;
    private String region;
    private String city;
    private String street;
    private String house;
    private String building;
    private String apartment;

    public Address(String input, char delimiter) {
        String[] parts = input.split(String.valueOf(delimiter));

        if (parts.length >= 1) {
            this.country = parts[0].trim();
        }
        if (parts.length >= 2) {
            this.region = parts[1].trim();
        }
        if (parts.length >= 3) {
            this.city = parts[2].trim();
        }
        if (parts.length >= 4) {
            this.street = parts[3].trim();
        }
        if (parts.length >= 5) {
            this.house = parts[4].trim();
        }
        if (parts.length >= 6) {
            this.building = parts[5].trim();
        }
        if (parts.length >= 7) {
            this.apartment = parts[6].trim();
        }
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", region='" + region + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", house='" + house + '\'' +
                ", building='" + building + '\'' +
                ", apartment='" + apartment + '\'' +
                '}';
    }

    public static void main(String[] args) {
        String input1 = "Russia, Moscow Region, Moscow, Lenin Street, 123, 2, 45";
        Address address1 = new Address(input1, ',');
        System.out.println(address1);

        String input2 = "USA; California; Los Angeles; Main Street; 456; ; 789";
        Address address2 = new Address(input2, ';');
        System.out.println(address2);
    }
}
