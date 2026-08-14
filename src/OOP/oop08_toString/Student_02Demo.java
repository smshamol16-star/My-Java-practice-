package OOP.oop08_toString;

public class Student_02Demo {

    public static void main(String[] args) {

        Student_02 s1 = new Student_02("Shamol", 20, "CSE");
        Student_02 s2 = new Student_02("Rahim", 22, "EEE");
        Student_02 s3 = new Student_02("Karim", 21, "BBA");

        Student_02[] students = {s1, s2, s3};

        for (int i = 0; i < students.length; i++) {

            System.out.println("Student: " + (i + 1));
            System.out.println(students[i]);
            System.out.println();

        }
    }
}