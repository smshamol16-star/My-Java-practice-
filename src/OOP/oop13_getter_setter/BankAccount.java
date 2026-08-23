package OOP.oop13_getter_setter;

    public class BankAccount {

        private String holder;
        private String accountNumber;
        private double balance;

        BankAccount(String holder, String accountNumber, double balance) {
            setHolder(holder);
            this.accountNumber = accountNumber;
            setBalance(balance);
        }

        public String getHolder() {
            return holder;
        }

        public String getAccountNumber() {
            return accountNumber;
        }

        public double getBalance() {
            return balance;
        }

        public void setHolder(String holder) {
            if (holder != null && !holder.isBlank()) {
                this.holder = holder;
            }
        }

        public void setBalance(double balance) {
            if (balance >= 0) {
                this.balance = balance;
            }
        }

        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
            }
        }

        public void withdraw(double amount) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
            }
        }
    }

