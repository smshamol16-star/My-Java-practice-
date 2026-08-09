package OOP.oop06_super;

public class Dog_01 extends Animal_01{

    Dog_01(String name){
        super(name);
    }
    void bark(){
        System.out.println(name+" is barking");
    }
}
