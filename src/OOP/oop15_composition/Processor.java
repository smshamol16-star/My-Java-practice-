package OOP.oop15_composition;

public class Processor {

    String brand;
    int cores;

    Processor(String brand, int cores) {
        this.brand = brand;
        this.cores = cores;
    }

    void showProcessorInfo() {
        System.out.println("Processor: " + brand);
        System.out.println("Cores: " + cores);

    }
}