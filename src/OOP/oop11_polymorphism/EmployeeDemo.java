package OOP.oop11_polymorphism;

public class EmployeeDemo {
    public static void main(String[]args){

        Employee employee;

        employee = new Developer();
        employee.work();

        employee = new Designer();
        employee.work();

    }
}
