package homework6.task7;

import homework6.task6.Printable;

public class Book implements Printable
{
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public void print() {
        System.out.println("Printing book details:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}
