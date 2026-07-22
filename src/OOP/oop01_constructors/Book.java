package OOP.oop01_constructors;

public class Book {

    String title;
    String author;
    int price;

    Book( String title, String author, int price) {
        this.title = title;
        this. author = author;
        this.price = price;
    }
    void display(){
        System.out.println("Titel: "+title);
        System.out.println("Author: "+author);
        System.out.println("Price: "+price);
    }
}
