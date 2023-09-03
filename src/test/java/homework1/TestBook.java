package homework1;

public class TestBook {
    public static void main(String[] args)
    {
        var book = new Book("Война и Мир", "Дзержинский");
        System.out.println(book);
        book.SetName("Test Name");
        book.SetAuthorName("Дзержик");
        book.SetPagesCount(1337);

        System.out.println(book);
    }
}
