package homework7.task7;

import homework6.task6.Printable;
import homework6.task7.Book;

public class Magazine implements Printable
{
    private String title;

    public Magazine(String title) {
        this.title = title;
    }

    @Override
    public void print() {
        System.out.println("Журнал: " + title);
    }

    // Статический метод для вывода названий журналов
    public static void printMagazines(Printable[] printable) {
        for (Printable item : printable) {
            if (item instanceof Magazine) {
                Magazine magazine = (Magazine) item;
                magazine.print();
            }
        }
    }

    public static void main(String[] args) {
        // Создаем массив объектов Printable
        Printable[] printableItems = new Printable[3];
        printableItems[0] = new Magazine("Модный журнал");
        printableItems[1] = new Magazine("Научный мир");
        printableItems[2] = new Book("Роман", "Обрамович");

        // Выводим только названия журналов
        Magazine.printMagazines(printableItems);
    }
}