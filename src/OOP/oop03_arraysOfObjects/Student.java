package OOP.oop03_arraysOfObjects;

public class Student {

    String name;
    int id;
    double cgpa;
    boolean isRegular;

    Student(String name, int id, double cgpa, boolean isRegular){
        this.name = name;
        this.id = id;
        this.cgpa = cgpa;
        this.isRegular = isRegular;
    }

    void displayInfo(){
        System.out.println("Name: "+ name);
        System.out.println("ID: "+ id);
        System.out.println("CGPA: "+ cgpa);
        System.out.println("Regular: "+ isRegular);
    }
}
