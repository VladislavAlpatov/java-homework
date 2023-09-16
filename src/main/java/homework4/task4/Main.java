package homework4.task4;

public class Main {
    public static void main(String[] args) {
        Processor processor = new Processor("Intel i9", 8, 3.8);
        Memory memory = new Memory(32, "DDR4");
        Monitor monitor = new Monitor(27, "1920x1080");

        Computer computer = new Computer(Brand.APPLE, processor, memory, monitor);

        System.out.println("Computer brand: " + computer.getBrand());
        System.out.println("Processor model: " + computer.getProcessor().getModel());
        System.out.println("Memory size: " + computer.getMemory().getSize() + "GB");
        System.out.println("Monitor resolution: " + computer.getMonitor().getResolution());
    }
}

