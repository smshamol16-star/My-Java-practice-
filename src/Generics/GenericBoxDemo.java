package Generics;

public class GenericBoxDemo {

    public static void main (String []args){

        Box<String> box1 = new Box<>();
        Box<Integer> box2 = new Box<>();
        Box<Double> box3 = new Box<>();

        box1.setSomething("Shamol");
        box2.setSomething(21);
        box3.setSomething(3.1416);

        System.out.println(box1.getSomething());
        System.out.println(box2.getSomething());
        System.out.println(box3.getSomething());

    }
}
