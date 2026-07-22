package OOP.oop01_constructors;

public class Student {

    String name;
    int age;
    String department;

    Student(String name, int age, String department){
        this.name = name;
        this.age = age;
        this.department = department;
    }

    void introduce(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Departmne: "+department);

    }




}
