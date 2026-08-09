package OOP.oop06_super;

public class Student extends Person{

    String department;

    Student(String name, int age, String department){
        super(name, age);
        this.department = department;
    }
    void study(){
        System.out.println(name+" is studying "+department);
    }

}
