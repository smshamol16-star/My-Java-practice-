package Collections.ArrayLists;


import java.util.ArrayList;

public class StudentNameManager {

    public static void main(String[] args){

        ArrayList<String> students = new ArrayList<>();

        students.add("Rahim");
        students.add("Karim");
        students.add("Shamim");
        students.add("Nila");
        students.add("Riya");

        System.out.println(students);
        System.out.println("Total Students: "+ students.size());

        if (students.contains("Karim")) {
            System.out.println("Is Karim present? true");
        } else {
            System.out.println("Is Karim present? false");
        }

        students.set(2, "Shamol");
        System.out.println("After update: "+ students);

        students.remove(1);
        System.out.println("After remove: "+ students);

        System.out.println("Student at index 1: "+ students.get(1));

        System.out.println("Final student list: ");
        for(String student : students){
            System.out.println(student);
        }
        System.out.println("Final size: "+ students.size());
    }
}
