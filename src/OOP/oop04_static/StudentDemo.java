package OOP.oop04_static;

public class StudentDemo {
    public static void main(String[]args){

        Student s1 = new Student("Shamol");
        Student s2 = new Student("Mehrab");
        Student s3 = new Student("Mahadi");

        System.out.println("\n====Students====\n");

        s1.displayStudent();
        s2.displayStudent();
        s3.displayStudent();

        Student.showTotalStudents();

    }
}
