package homework2.task1;

public class TestAuthor {
    public static void main(String[] args) {
        // Создаем объект класса Author с помощью конструктора
        Author author = new Author("John Doe", "johndoe@example.com", 'M');

        // Используем геттеры для получения информации об авторе
        System.out.println("Author's Name: " + author.getName());
        System.out.println("Author's Email: " + author.getEmail());
        System.out.println("Author's Gender: " + author.getGender());
    }
}
