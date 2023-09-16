package homework4.task2;

// Перечисление размеров одежды
enum Size {
    XXS("Детский размер", 32),
    XS("Взрослый размер", 34),
    S("Взрослый размер", 36),
    M("Взрослый размер", 38),
    L("Взрослый размер", 40);

    private String description;
    private int euroSize;

    Size(String description, int euroSize) {
        this.description = description;
        this.euroSize = euroSize;
    }

    public String getDescription() {
        return description;
    }

    public int getEuroSize() {
        return euroSize;
    }
}

// Интерфейсы для мужской и женской одежды
interface MenClothing {
    void dressMan();
}

interface WomenClothing {
    void dressWomen();
}

// Абстрактный класс Clothes
abstract class Clothes {
    Size size;
    int cost;
    String color;

    Clothes(Size size, int cost, String color) {
        this.size = size;
        this.cost = cost;
        this.color = color;
    }
}

// Классы наследники
class TShirt extends Clothes implements MenClothing, WomenClothing {
    public TShirt(Size size, int cost, String color) {
        super(size, cost, color);
    }

    public void dressMan() {
        System.out.println("T-shirt for men: " + size + " " + cost + " " + color);
    }

    public void dressWomen() {
        System.out.println("T-shirt for women: " + size + " " + cost + " " + color);
    }
}

class Pants extends Clothes implements MenClothing, WomenClothing {
    public Pants(Size size, int cost, String color) {
        super(size, cost, color);
    }

    public void dressMan() {
        System.out.println("Pants for men: " + size + " " + cost + " " + color);
    }

    public void dressWomen() {
        System.out.println("Pants for women: " + size + " " + cost + " " + color);
    }
}

class Skirt extends Clothes implements WomenClothing {
    public Skirt(Size size, int cost, String color) {
        super(size, cost, color);
    }

    public void dressWomen() {
        System.out.println("Skirt for women: " + size + " " + cost + " " + color);
    }
}

class Tie extends Clothes implements MenClothing {
    public Tie(Size size, int cost, String color) {
        super(size, cost, color);
    }

    public void dressMan() {
        System.out.println("Tie for men: " + size + " " + cost + " " + color);
    }
}

class Atelier {
    public static void dressWomen(Clothes[] clothes) {
        for (Clothes c : clothes) {
            if (c instanceof WomenClothing) {
                ((WomenClothing) c).dressWomen();
            }
        }
    }

    public static void dressMan(Clothes[] clothes) {
        for (Clothes c : clothes) {
            if (c instanceof MenClothing) {
                ((MenClothing) c).dressMan();
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Clothes[] clothes = {
                new TShirt(Size.M, 1000, "Red"),
                new Pants(Size.L, 1500, "Black"),
                new Skirt(Size.S, 1000, "Blue"),
                new Tie(Size.M, 500, "Green")
        };

        Atelier.dressWomen(clothes);
        Atelier.dressMan(clothes);
    }
}

