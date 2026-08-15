package OOP.oop09_abstraction;

public abstract class Animal{

    String name;

    abstract void sound();

    void eat(){
        System.out.println(name+" is eating.");

    }
}
