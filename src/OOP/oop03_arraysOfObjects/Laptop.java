package OOP.oop03_arraysOfObjects;

public class Laptop {

    String brand;
    double price;
    Laptop(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }
    void showDetails(){
        System.out.println("Brand: "+brand+"\nPrice: "+price);

    }

}
