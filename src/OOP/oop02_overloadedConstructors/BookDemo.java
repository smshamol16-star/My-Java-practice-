package OOP.oop02_overloadedConstructors;

public class BookDemo {
    public static void main(String[]args){

    Book book1 = new Book("\"Life Changer\"");
    Book book2 = new Book("\"Atomic Habits\"," +
                                "\"James Clear\"," +
                                "800");


        book1.displayBook();
        System.out.println("");
        book2.displayBook();

    }
}
