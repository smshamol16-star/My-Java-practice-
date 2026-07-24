package OOP.oop02_overloadedConstructors;

public class Employee {

    String name;
    double salary;

    Employee(){
        this.name = "Unknown";
        this.salary = 25000;
    }
    Employee(String name){
        this.name = name;
        this.salary = 25000;
    }
    Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }
    void displayEmployee(){
        System.out.println("Name: " + name+"\nSalary: "+salary);
    }
    void increaseSalary(double amount){
        System.out.println("Increase Salary: "+amount);
        salary+=amount;
        System.out.println("New Salary: "+salary);
    }
}
