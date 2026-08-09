package OOP.oop06_super;

public class Car extends Vehicle{

    Car(String brand){
        super(brand);
    }
    void drive(){
        System.out.println(brand+" is driving");
    }
}
