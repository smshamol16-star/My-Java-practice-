package OOP.oop09_abstraction;

public class ShapeDemo {
    public static void main(String[]args){

        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(5,8);

        circle.showType();
        circle.calculateArea();

        rectangle.showType();
        rectangle.calculateArea();

    }
}
