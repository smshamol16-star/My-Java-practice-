package OOP.oop02_overloadedConstructors;

public class StudentDemo {
    public static void main(String[]args){

        Student student1 = new Student("Shamol");
        Student student2 = new Student("Rakib", 20,"CSE");
        Student student3 = new Student("Ahmed", 22,"EEE");


        student1.introduce();
        System.out.println();
        student2.introduce();
        System.out.println();
        student3.introduce();


    }
}
