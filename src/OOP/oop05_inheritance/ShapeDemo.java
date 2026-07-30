package OOP.oop05_inheritance;

public class ShapeDemo {
    public static void main(String[]args){

        Circle c = new Circle();
        c.color = "Red";
        c.radius = 5;

        c.showColor();

        c.showArea();
    }
}
