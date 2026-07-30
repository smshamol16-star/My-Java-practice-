package OOP.oop05_inheritance;

public class Circle extends  Shape{

    double radius;


    void showArea(){

        double area = Math.PI*radius*radius;
        System.out.println("Area: "+area);
    }
}
