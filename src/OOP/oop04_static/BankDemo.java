package OOP.oop04_static;

public class BankDemo {
    public static void main (String[]args){

        Bank b1 = new Bank("Shamol", 5000);
        Bank b2 = new Bank("Mahadi", 2000);

        System.out.println("\n====Details====");
        b1.displayAccount();
        b2.displayAccount();

    }
}
