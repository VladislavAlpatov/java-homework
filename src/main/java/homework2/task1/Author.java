package homework2.task1;

public class Author {
    private String name;
    private String email;
    private char gender;

    // Конструктор класса Author
    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    // Геттеры для полей
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }
}

