package OOP.oop16_wrapperClasses;

public class StudentMarks {

    public static void main (String[] args){

        Integer marks = 85;
        Double percentage = 87.5;
        Character grade = 'A';
        Boolean passed = true;

        int primitive = marks; // Unboxing...

        studentInfo(marks, percentage, grade, passed);
    }

    static void studentInfo(Integer marks, Double percentage, Character grade, Boolean passed){
        System.out.println("Marks: "+ marks);
        System.out.println("Percentage: "+ percentage);
        System.out.println("Grade: "+ grade);
        System.out.println("Passed: "+ passed);
    }
}
