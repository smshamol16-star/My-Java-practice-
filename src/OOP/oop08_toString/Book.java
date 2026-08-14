package OOP.oop08_toString;

public class Book {

    String title;
    String author;
    double price;

    Book(String title,String author,double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }
    @Override
    public String toString(){
        return "Title: "+this.title
                +"\nAuthor: "+this.author
                +"\nPrice: "+this.price;

    }
}
