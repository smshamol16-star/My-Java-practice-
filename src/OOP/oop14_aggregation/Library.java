package OOP.oop14_aggregation;

public class Library {

    String name;
    Book [] books;

    Library(String name,Book[]books){
        this.name = name;
        this.books = books;

    }

    void showLibraryInfo(){
        System.out.println("Library name: "+name);
        System.out.println();
        System.out.println("******");
        System.out.println("Books: ");
        System.out.println("******");
        System.out.println();
        for(Book book : books){
            book.showBookInfo();

        }
    }
}
