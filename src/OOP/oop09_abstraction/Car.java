package OOP.oop09_abstraction;

public class Car extends Vehicle{

    Car(String brand){
        super(brand);
    }

    @Override
    void start(){
        System.out.println(brand+" is starting.");

    }
}
