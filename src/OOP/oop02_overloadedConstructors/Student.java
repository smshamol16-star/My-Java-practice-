package OOP.oop02_overloadedConstructors;

public class Student {

    String name;
    int age;
    String department;

    Student(String name){
        this.name = name;
        this.age = 18;
        this.department = "Unknown";
    }
    Student(String name, int age, String department){
        this.name = name;
        this.age = age;
        this.department = department;
    }
    void introduce(){
        System.out.println("Student name: "+name+"\nage: "+age+"\ndepartment: "+department+".");
    }


}
