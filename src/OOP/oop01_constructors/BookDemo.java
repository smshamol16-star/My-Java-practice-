package OOP.oop01_constructors;

public class BookDemo {
    public static void main(String[]args){

        Book book1 = new Book("Life Changer", "Shamol", 2000);
        Book book2 = new Book("Mind Coverter", "Mehrab",1000);

        book1.display();

        System.out.println("");

        book2.display();

    }
}
