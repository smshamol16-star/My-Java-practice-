package OOP.oop04_static;

public class EmployeeDemo {
    public static void main(String[]args){

        Employee e1 = new Employee("Shamol",5000);
        Employee e2 = new Employee("Mahadi",2000);

        Employee.changeCompany("Google");

        System.out.println("\n====Details====\n");
        e1.displayEmployee();
        System.out.println("\n--------------");
        e2.displayEmployee();

    }
}
