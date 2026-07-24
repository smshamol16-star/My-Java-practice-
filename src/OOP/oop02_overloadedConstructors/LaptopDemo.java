package OOP.oop02_overloadedConstructors;

public class LaptopDemo {
    public static void main(String[] args){

        Laptop l1 = new Laptop();
        Laptop l2 = new Laptop("HP");
        Laptop l3 = new Laptop("Asus", "Tuf F16",142000);

        l1.showDetails();
        System.out.println();
        l2.showDetails();
        System.out.println();
        l3.showDetails();
    }
}
