package OOP.oop09_abstraction;

public class Developer extends Employee{

    Developer(String name, double salary){
        super(name, salary);
    }

    @Override
    void work(){
        System.out.println(name+" is writing code");

    }
}
