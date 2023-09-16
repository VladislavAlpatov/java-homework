package homework4_1.task6;

class Employer {
    private String firstName;
    private String lastName;
    private double income;

    public Employer(String firstName, String lastName, double income) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.income = income;
    }

    public double getIncome() {
        return income * 12;
    }
}

class Manager extends Employer {
    private double averageSum;

    public Manager(String firstName, String lastName, double income, double averageSum) {
        super(firstName, lastName, income);
        this.averageSum = averageSum;
    }

    @Override
    public double getIncome() {
        // Переопределяем метод getIncome() для класса Manager
        return super.getIncome() + averageSum;
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        // Создаем объекты класса Employer и Manager
        Employer employer1 = new Employer("Иван", "Петров", 50000);
        Manager manager1 = new Manager("Анна", "Иванова", 60000, 10000);

        // Создаем массив объектов типа Employer
        Employer[] employees = new Employer[2];
        employees[0] = employer1;
        employees[1] = manager1;

        // Вызываем метод getIncome() для каждого элемента массива
        for (Employer employee : employees) {
            System.out.println(employee.getIncome());
        }
    }
}
