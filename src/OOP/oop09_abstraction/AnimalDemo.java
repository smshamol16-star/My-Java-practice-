package OOP.oop09_abstraction;

public class AnimalDemo {
    public static void main(String[] args){

        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.name = "Tom";
        cat.name = "Pihu";

        dog.eat();
        dog.sound();

        System.out.println();

        cat.eat();
        cat.sound();

    }
}
