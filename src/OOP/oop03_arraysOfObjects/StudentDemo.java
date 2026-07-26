package OOP.oop03_arraysOfObjects;

public class StudentDemo {
    public static void main(String[]args){

        Student student1 = new Student("Shamol",22);
        Student student2 = new Student("Mehrab",18);
        Student student3 = new Student("Mahadi",23);
        Student student4 = new Student("Rakib",25);
        Student student5 = new Student("Rahim",28);

        Student [] students = {student1,student2,student3,student4,student5};

        for(Student student: students){
            student.introduce();
            System.out.println();
        }

    }
}
