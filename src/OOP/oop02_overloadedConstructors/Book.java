package OOP.oop02_overloadedConstructors;

public class Book {

    String title;
    String author;
    int price;

    Book(String title){
        this.title = title;
        this.author = "Unknown";
        this.price = 0;
    }
    Book(String title, String author, int price){
        this.title = title;
        this.author = author;
        this.price = price;

    }
    void displayBook(){
        System.out.println("Titel is "+title+", author is "+author+" and price is "+price);
    }


}