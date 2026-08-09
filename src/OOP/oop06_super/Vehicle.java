package OOP.oop06_super;

public class Vehicle {

    String brand;
    Vehicle(String brand){
        this.brand = brand;
    }
    void start(){
        System.out.println(brand+" is starting");
    }
}
