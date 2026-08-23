package OOP.oop13_getter_setter;

public class BankAccountDemo {

    public static void main(String[] args) {

        BankAccount account =
                new BankAccount("Shamol", "12345", 10000);

        System.out.println("Holder: " + account.getHolder());
        System.out.println("Account: " + account.getAccountNumber());
        System.out.println("Balance: " + account.getBalance());

        account.deposit(5000);

        System.out.println("\nAfter Deposit:");
        System.out.println("Balance: " + account.getBalance());

        account.withdraw(3000);

        System.out.println("\nAfter Withdraw:");
        System.out.println("Balance: " + account.getBalance());

        account.withdraw(20000);

        System.out.println("\nAfter Invalid Withdraw:");
        System.out.println("Balance: " + account.getBalance());
    }
}