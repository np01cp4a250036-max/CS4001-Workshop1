package week9;


/**
 * Write a description of class savingsaccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SavingAccount extends BankAccount {
    double interestRate;

    SavingAccount(int accountNumber, String accountHolderName, double balance, double interestRate) {
        super(accountNumber, accountHolderName, balance);
        this.interestRate = interestRate;
    }

    
    double calculateInterest() {
        return getBalance() * interestRate / 100;
    }

    void displaySavingAccount() {
        displayAccountInfo();
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("Interest: " + calculateInterest());
    }
}
