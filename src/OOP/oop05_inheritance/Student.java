package OOP.oop05_inheritance;

public class Student extends Person{

    String department;

    void study(){
        System.out.println(name + " is studying " + department + ".");
    }
}
