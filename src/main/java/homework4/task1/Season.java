package homework4.task1;

public enum Season {
    WINTER("Холодное время года", -5),
    SPRING("Холодное время года", 10),
    SUMMER("Теплое время года", 25) {
        public String getDescription() {
            return "Теплое время года";
        }
    },
    AUTUMN("Холодное время года", 15);

    private String description;
    private int avgTemp;

    Season(String description, int avgTemp) {
        this.description = description;
        this.avgTemp = avgTemp;
    }

    public String getDescription() {
        return description;
    }

    public int getAvgTemp() {
        return avgTemp;
    }
}