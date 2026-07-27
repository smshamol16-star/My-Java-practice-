package OOP.oop04_static;

public class Student {

    static int studentCount;

    String name;

    Student (String name){
        this.name = name;
        studentCount++;
    }

    void displayStudent(){
        System.out.println("Name: "+name);
    }

    static void showTotalStudents(){
        System.out.println("\n-------------------\n");
        System.out.println("Total Students: "+studentCount);

    }
}