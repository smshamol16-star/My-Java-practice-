package OOP.oop07_methodOverriding;

public class Car extends Vehicle{

    @Override
    void start(){
        System.out.println("Car is starting with a key");
    }
}
