package week9;


/**
 * Write a description of class bankaccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankAccount {
    int accountNumber;
    String accountHolderName;
    double balance;

    
    BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    
    double getBalance() {
        return balance;
    }


    void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }
}
