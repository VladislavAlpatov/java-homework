package homework2.task7;

import java.util.Arrays;
import java.util.Objects;

public class BookShelf {
    private Book[] books;
    private int count;

    public BookShelf(int size) {
        this.books = new Book[size];
        this.count = 0;
    }

    public void addBook(Book book) {
        if (count < books.length) {
            books[count++] = book;
        }
    }

    public Book getEarliestBook() {
        return Arrays.stream(books)
                .filter(Objects::nonNull)
                .min(Book::compareTo)
                .orElse(null);
    }

    public Book getLatestBook() {
        return Arrays.stream(books)
                .filter(Objects::nonNull)
                .max(Book::compareTo)
                .orElse(null);
    }

    public void sortBooksByYear() {
        Arrays.sort(books, 0, count);
    }

    @Override
    public String toString() {
        return "BookShelf { " +
                "books=" + Arrays.toString(books) +
                " }";
    }
}
