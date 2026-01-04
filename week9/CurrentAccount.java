package week9;


/**
 * Write a description of class currentaccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CurrentAccount extends BankAccount {
    double overdraftLimit;

    CurrentAccount(int accountNumber, String accountHolderName, double balance, double overdraftLimit) {
        super(accountNumber, accountHolderName, balance);
        this.overdraftLimit = overdraftLimit;
    }

    
    boolean withdraw(double amount) {
        if (amount <= balance + overdraftLimit) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            return true;
        } else {
            System.out.println("Withdraw failed: Insufficient funds!");
            return false;
        }
    }

    void displayCurrentAccount() {
        displayAccountInfo();
        System.out.println("Overdraft Limit: " + overdraftLimit);
    }
}
