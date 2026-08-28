package OOP.oop15_composition;

public class Engine {

    String type;
    int horsePower;

    Engine(String type, int horsePower) {
        this.type = type;
        this.horsePower = horsePower;
    }

    void showEngineInfo() {
        System.out.println("Engine Type: " + type);
        System.out.println("Horse Power: " + horsePower);

    }
}