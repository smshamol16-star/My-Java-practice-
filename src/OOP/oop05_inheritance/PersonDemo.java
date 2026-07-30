package OOP.oop05_inheritance;

public class PersonDemo {
    public static void main(String[]args){

        Student s = new Student();

        s.name = "Shamol";
        s.age = 20;
        s.department = "CSE";

        s.introduce();
        s.study();
    }
}
