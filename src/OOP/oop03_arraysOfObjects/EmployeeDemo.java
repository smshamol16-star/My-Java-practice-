package OOP.oop03_arraysOfObjects;

import java.util.Scanner;

public class EmployeeDemo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("How many employees?: ");
        int amount = scanner.nextInt();
        scanner.nextLine();

        Employee[] employees = new Employee[amount];


        for (int i = 0; i < amount; i++) {

            System.out.println("\nEmployee " + (i + 1));

            System.out.print("Enter Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Salary: ");
            double salary = scanner.nextDouble();
            scanner.nextLine();

            employees[i] = new Employee(name, salary);

        }

        double totalSalary = 0;


        System.out.println("\n========== Employee List ==========\n");

        for (Employee employee : employees) {

            employee.displayEmployee();
            System.out.println();

            totalSalary += employee.salary;

        }

        double averageSalary = totalSalary / employees.length;

        System.out.println("------------------------------");
        System.out.println("Total Salary   : " + totalSalary);
        System.out.println("Average Salary : " + averageSalary);

        scanner.close();
    }
}