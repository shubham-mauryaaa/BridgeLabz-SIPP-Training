package OOps_Basic;

public class ATM {
       public static void main(String[] args) {
        BankAccount account = new BankAccount("Alice", "123456", 1000);
        account.deposit(500);
        account.withdraw(200);
        account.displayBalance();
    }  
}   





class BankAccount {
    String accountHolder;
    String accountNumber;
    double balance;

    BankAccount(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (amount <= balance) balance -= amount;
        else System.out.println("Insufficient Balance");
    }

    void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }   
}