package OOP.oop08_toString;

public class Student_02 {

    String name;
    int age;
    String department;

    Student_02(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    @Override
    public String toString() {
        return "Name: " + name
                + "\nAge: " + age
                + "\nDepartment: " + department;
    }
}