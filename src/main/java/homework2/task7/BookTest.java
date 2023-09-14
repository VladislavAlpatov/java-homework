package homework2.task7;

public class BookTest {
    public static void main(String[] args) {
        // Создаем экземпляр книжной полки
        BookShelf shelf = new BookShelf(5);

        // Добавляем книги
        shelf.addBook(new Book("Author1", "Title1", 2001));
        shelf.addBook(new Book("Author2", "Title2", 1995));
        shelf.addBook(new Book("Author3", "Title3", 2020));

        // Выводим информацию о книгах на полке
        System.out.println("Initial shelf: " + shelf);

        // Получаем и выводим книгу с самым ранним и поздним годом издания
        System.out.println("Earliest book: " + shelf.getEarliestBook());
        System.out.println("Latest book: " + shelf.getLatestBook());

        // Сортируем книги по году и выводим
        shelf.sortBooksByYear();
        System.out.println("Sorted shelf: " + shelf);
    }
}
