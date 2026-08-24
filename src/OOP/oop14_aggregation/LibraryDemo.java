package OOP.oop14_aggregation;

public class LibraryDemo {

    public static void main (String [] args){

        Book book1 = new Book("Java Basics","James");
        Book book2 = new Book("Clean Code","Robert Martin");
        Book book3 = new Book("Effective Java","Joshua Bloch");

        Book books [] = {book1,book2,book3};

        Library library = new Library("Central Library",books);

        library.showLibraryInfo();

    }
}
