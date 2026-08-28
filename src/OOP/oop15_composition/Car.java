package OOP.oop15_composition;

public class Car {

    String brand;
    Engine engine;

    Car(String brand, String engineType, int horsePower) {
        this.brand = brand;
        this.engine = new Engine(engineType, horsePower);
    }

    void showCarInfo() {
        System.out.println("Brand: " + brand);
        engine.showEngineInfo();
    }
}