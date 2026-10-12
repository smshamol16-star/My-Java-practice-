package OOP.oop03_arraysOfObjects;

public class StudentDemo {
    public static void main(String[]args){

        Student student1 = new Student("Rahim", 101, 3.80, true);
        Student student2 = new Student("Karim", 102, 3.20, true);
        Student student3 = new Student("Sakib", 103, 3.65, false);
        Student student4 = new Student("Nila", 104, 3.90, true);

        Student [] students  = {student1, student2, student3, student4};

        System.out.println("\n----- All Student -----\n");
        for (Student student : students){
            student.displayInfo();
            System.out.println("--------------");
        }
        System.out.println("\n----- High CGPA Students (3.5+) -----\n");
        for (Student student : students){
            if (student.cgpa>=3.5){
                System.out.println(student.name+ "-"+ student.cgpa);
            }
        }

    }
}
