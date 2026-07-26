package OOP.oop03_arraysOfObjects;

public class BookDemo {
    public static void main(String[]args){

        Book book1 = new Book("Life changer", "Shamol");
        Book book2 = new Book("Something Special", "Mehrab");
        Book book3 = new Book("Fool Of All Time", "Mahadi");

        Book [] books = {book1,book2,book3};

        System.out.println("\n========== Book List ==========\n");

        for(Book book: books){
            book.display();
            System.out.println();
        }

    }
}
