package homework7.task8;
interface Printable {
    void print();
}

// Класс Book, реализующий интерфейс Printable
class Book implements Printable {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    @Override
    public void print() {
        System.out.println("Книга: " + title);
    }

    // Статический метод для вывода названий книг
    public static void printBooks(Printable[] printable) {
        for (Printable item : printable) {
            if (item instanceof Book) {
                Book book = (Book) item;
                book.print();
            }
        }
    }

    public static void main(String[] args) {
        // Создаем массив объектов Printable
        Printable[] printableItems = new Printable[3];
        printableItems[0] = new Magazine("Модный журнал");
        printableItems[1] = new Book("Роман");
        printableItems[2] = new Book("Научная книга");

        // Выводим только названия книг
        Book.printBooks(printableItems);
    }
}

// Пример другого класса, реализующего интерфейс Printable
class Magazine implements Printable {
    private String title;

    public Magazine(String title) {
        this.title = title;
    }

    @Override
    public void print() {
        System.out.println("Журнал: " + title);
    }
}
