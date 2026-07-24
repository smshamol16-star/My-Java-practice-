package OOP.oop02_overloadedConstructors;

public class EmployeeDemo {
    public static void main(String[]args){

        Employee e1 = new Employee();
        Employee e2 = new Employee("Rakib");
        Employee e3 = new Employee("Rahim", 40000);

        e1.displayEmployee();
        e1.increaseSalary(5000);
        System.out.println();
        e2.displayEmployee();
        System.out.println();
        e3.displayEmployee();

    }
}
