package homework2.task7;

public class Book implements Comparable<Book> {
    private String author;
    private String title;
    private int year;

    public Book(String author, String title, int year) {
        this.author = author;
        this.title = title;
        this.year = year;
    }

    // Геттеры и сеттеры
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public int compareTo(Book other) {
        return Integer.compare(this.year, other.year);
    }

    @Override
    public String toString() {
        return "Book { " +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", year=" + year +
                " }";
    }
}
