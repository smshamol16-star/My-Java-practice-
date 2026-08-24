package OOP.oop14_aggregation;

public class Player {

    String name;
    int age;

    Player(String name, int age){
        this.name = name;
        this.age = age;

    }

    void showPlayerInfo(){
        System.out.println("Name: "+ name);
        System.out.println("Age: "+age);
        System.out.println();

    }
}
