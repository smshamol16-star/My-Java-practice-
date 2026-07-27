package OOP.oop04_static;

public class Employee {
    static String companyName = "OpenAI";

    String name;
    double salary;

    Employee(String name, double salary){
        this.name = name;
        this.salary = salary;

    }
    static void changeCompany(String newCompany){
        companyName = newCompany;
    }
    void displayEmployee(){
        System.out.println("Company: "+companyName);
        System.out.println("Name: "+name);
        System.out.printf("Salary: %.2f",salary);

    }
}
