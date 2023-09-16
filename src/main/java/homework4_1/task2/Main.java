package homework4_1.task2;

public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone("1234567890", "iPhone", 150.5);
        Phone phone2 = new Phone("0987654321", "Samsung");
        Phone phone3 = new Phone();

        System.out.println("Phone 1: " + phone1.getNumber());
        System.out.println("Phone 2: " + phone2.getNumber());
        System.out.println("Phone 3: " + phone3.getNumber());

        phone1.receiveCall("Alice");
        phone2.receiveCall("Bob");
        phone3.receiveCall("Charlie");

        phone1.receiveCall("Alice", "1234567890");

        phone1.sendMessage("111", "222", "333");
    }
}
