package homework4.task1;


public class Main {
    public static void main(String[] args) {
        // 1) Ваше любимое время года
        Season favSeason = Season.SUMMER;
        System.out.println("Favorite season: " + favSeason);
        System.out.println("Avg temp: " + favSeason.getAvgTemp());
        System.out.println("Description: " + favSeason.getDescription());

        // 2) Метод с оператором switch
        printLoveSeason(favSeason);

        // 6) Вывод всех времен года с описанием и средней температурой
        for (Season s : Season.values()) {
            System.out.println(s + " Avg temp: " + s.getAvgTemp() + " Description: " + s.getDescription());
        }
    }

    public static void printLoveSeason(Season s) {
        switch (s) {
            case WINTER -> System.out.println("Я люблю зиму");
            case SPRING -> System.out.println("Я люблю весну");
            case SUMMER -> System.out.println("Я люблю лето");
            case AUTUMN -> System.out.println("Я люблю осень");
        }
    }
}
