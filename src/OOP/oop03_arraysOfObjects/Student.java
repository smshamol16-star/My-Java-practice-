package OOP.oop03_arraysOfObjects;

public class Student {

    String name;
    int age;

    Student(String name, int age){
        this.name = name;
        this.age = age;

    }
    void introduce(){
        System.out.println("Name: "+name+"\nAge: "+age);

    }
}
