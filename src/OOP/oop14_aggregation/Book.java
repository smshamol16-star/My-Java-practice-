package OOP.oop14_aggregation;

public class Book {

    String title;
    String author;

    Book(String title,String author){
        this.title = title;
        this.author = author;

    }

    void showBookInfo(){
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println();

    }
}
