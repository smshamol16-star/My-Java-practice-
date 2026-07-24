package OOP.oop02_overloadedConstructors;

public class Laptop {

    String brand;
    String model;
    int price;

    Laptop(){
        this.brand = "Dell";
        this.model = "Unknown";
        this.price = 50000;
    }
    Laptop(String brand){
        this.brand = brand;
        this.model = "Unknown";
        this.price = 50000;
    }
    Laptop(String brand, String model, int price){
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
    void showDetails(){
        System.out.println("Brand: "+brand+"\nModel: "+model+"\nPrice: "+price);
    }
}
