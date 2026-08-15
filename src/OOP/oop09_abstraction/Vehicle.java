package OOP.oop09_abstraction;

public abstract class Vehicle {

    String brand;
    Vehicle(String brand){
        this.brand = brand;
    }

    abstract void start();

    void stop(){
        System.out.println(brand+" is stopping.");

    }
}
