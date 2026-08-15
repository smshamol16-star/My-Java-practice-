package OOP.oop09_abstraction;

public abstract class Employee {

    String name;
    double salary;

    Employee(String name,double salary){
        this.name = name;
        this.salary = salary;
    }

    abstract void work();

    void displayInfo(){
        System.out.println("Name: "+name);
        System.out.println("Salary: "+salary);

    }
}
