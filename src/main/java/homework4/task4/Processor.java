package homework4.task4;

public class Processor {
    private String model;
    private int coreCount;
    private double frequency;

    public Processor(String model, int coreCount, double frequency) {
        this.model = model;
        this.coreCount = coreCount;
        this.frequency = frequency;
    }

    public String getModel() {
        return model;
    }

    public int getCoreCount() {
        return coreCount;
    }

    public double getFrequency() {
        return frequency;
    }
}
