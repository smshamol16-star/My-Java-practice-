package OOP.oop15_composition;

public class Computer {

    String brand;
    Processor processor;

    Computer(String brand, String processorBrand, int cores) {
        this.brand = brand;
        this.processor = new Processor(processorBrand, cores);
    }

    void showComputerInfo() {
        System.out.println("Computer Brand: " + brand);
        processor.showProcessorInfo();

    }
}