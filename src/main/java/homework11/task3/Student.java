package homework11.task3;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
    private String firstName;
    private String lastName;
    private String specialty;
    private int course;
    private String group;
    private Date birthDate; // Новое поле для даты рождения

    public Student(String firstName, String lastName, String specialty, int course, String group, Date birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.specialty = specialty;
        this.course = course;
        this.group = group;
        this.birthDate = birthDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSpecialty() {
        return specialty;
    }

    public int getCourse() {
        return course;
    }

    public String getGroup() {
        return group;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    // Метод для получения строкового представления даты рождения в указанном формате
    public String getBirthDateAsString(String format) {
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
        return dateFormat.format(birthDate);
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", specialty='" + specialty + '\'' +
                ", course=" + course +
                ", group='" + group + '\'' +
                ", birthDate=" + getBirthDateAsString("yyyy-MM-dd") + // Здесь указываем формат
                '}';
    }

    public static void main(String[] args) {
        // Пример использования
        Date birthDate = new Date(); // Замените на реальную дату рождения
        Student student = new Student("John", "Doe", "Computer Science", 2, "CS101", birthDate);
        System.out.println(student);
        System.out.println("Дата рождения в коротком формате: " + student.getBirthDateAsString("dd/MM/yyyy"));
    }
}
