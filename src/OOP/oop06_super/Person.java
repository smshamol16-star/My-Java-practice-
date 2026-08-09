package OOP.oop06_super;

public class Person {

    String name;
    int age;

    Person(String name, int age){
        this.name =name;
        this.age = age;
    }
    void introduce(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}
