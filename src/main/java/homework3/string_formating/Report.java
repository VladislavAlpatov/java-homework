package homework3.string_formating;

public class Report {
    public static void generateReport(Employee[] employees) {
        System.out.println("Employee Salary Report");
        for (Employee emp : employees) {
            System.out.printf("%-20s : %10.2f%n", emp.fullname, emp.salary);
        }
    }
}

