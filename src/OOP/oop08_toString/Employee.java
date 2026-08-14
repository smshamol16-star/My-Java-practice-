package OOP.oop08_toString;

public class Employee {

    String name;
    double salary;
    String company;

    Employee(String name,double salary,String company){
        this.name = name;
        this.salary = salary;
        this.company = company;

    }
    @Override
    public String toString(){
        return "Name: "+ this.name
                +"\nSalary: "+ this.salary
                +"\nCompany: "+ this.company;

    }
}
