package homework4_1.task5;

// Класс, представляющий информацию о книгах
class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}

// Класс, представляющий информацию о читателе
class Reader {
    private String fullName;
    private int libraryCardNumber;
    private String faculty;
    private String dateOfBirth;
    private String phoneNumber;

    public Reader(String fullName, int libraryCardNumber, String faculty, String dateOfBirth, String phoneNumber) {
        this.fullName = fullName;
        this.libraryCardNumber = libraryCardNumber;
        this.faculty = faculty;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
    }

    // Метод для вывода сообщения о взятии книг по их количеству
    public void takeBook(int count) {
        System.out.println(fullName + " взял " + count + " книги");
    }

    // Метод для вывода сообщения о взятии книг по их названиям
    public void takeBook(String... bookTitles) {
        System.out.print(fullName + " взял книги: ");
        for (String title : bookTitles) {
            System.out.print(title + ", ");
        }
        System.out.println();
    }

    // Метод для вывода сообщения о взятии книг по объектам Book
    public void takeBook(Book... books) {
        System.out.print(fullName + " взял книги: ");
        for (Book book : books) {
            System.out.print(book.getTitle() + " (автор: " + book.getAuthor() + "), ");
        }
        System.out.println();
    }

    // Метод для вывода сообщения о возврате книг по их количеству
    public void returnBook(int count) {
        System.out.println(fullName + " вернул " + count + " книги");
    }

    // Метод для вывода сообщения о возврате книг по их названиям
    public void returnBook(String... bookTitles) {
        System.out.print(fullName + " вернул книги: ");
        for (String title : bookTitles) {
            System.out.print(title + ", ");
        }
        System.out.println();
    }

    // Метод для вывода сообщения о возврате книг по объектам Book
    public void returnBook(Book... books) {
        System.out.print(fullName + " вернул книги: ");
        for (Book book : books) {
            System.out.print(book.getTitle() + " (автор: " + book.getAuthor() + "), ");
        }
        System.out.println();
    }
}

public class LibraryApp {
    public static void main(String[] args) {
        // Создаем объекты читателей
        Reader reader1 = new Reader("Петров В. В.", 12345, "Факультет информатики", "01.01.1990", "+7 (123) 456-7890");
        Reader reader2 = new Reader("Иванов И. И.", 54321, "Факультет физики", "15.05.1985", "+7 (987) 654-3210");

        // Создаем объекты книг
        Book book1 = new Book("Приключения", "Автор1");
        Book book2 = new Book("Словарь", "Автор2");
        Book book3 = new Book("Энциклопедия", "Автор3");

        // Вызываем методы takeBook() и returnBook() для читателей
        reader1.takeBook(3); // Петров В. В. взял 3 книги
        reader1.takeBook("Приключения", "Словарь", "Энциклопедия"); // Петров В. В. взял книги: Приключения, Словарь, Энциклопедия
        reader1.takeBook(book1, book2, book3); // Петров В. В. взял книги: Приключения (автор: Автор1), Словарь (автор: Автор2), Энциклопедия (автор: Автор3)

        reader2.returnBook(2); // Иванов И. И. вернул 2 книги
        reader2.returnBook("Приключения", "Словарь"); // Иванов И. И. вернул книги: Приключения, Словарь
        reader2.returnBook(book1, book2); // Иванов И. И. вернул книги: Приключения (автор: Автор1), Словарь (автор: Автор2)
    }
}
