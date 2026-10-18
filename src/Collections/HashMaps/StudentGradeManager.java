package Collections.HashMaps;

import java.util.HashMap;

public class StudentGradeManager {

    public static void main(String[] args) {

        HashMap<String, Integer> students = new HashMap<>();

        students.put("Shamol", 95);
        students.put("Himel", 85);
        students.put("Rahim", 75);
        students.put("Mahadi", 65);

        System.out.println("Total Student: "+students.size());

        System.out.println("Marks of Shamol: "+students.get("Shamol"));
        students.put("Mahadi", 60);

        students.remove("Rahim");

        for(String key : students.keySet()){
            System.out.println("Name: "+ key+" Number: "+ students.get(key));
        }
    }
}