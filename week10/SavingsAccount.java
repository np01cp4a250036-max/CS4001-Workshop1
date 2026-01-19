package week10;


/**
 * Write a description of class Savingsaccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SavingsAccount extends Account {

    public SavingsAccount(int accountNo, String holderName, double balance) {
        super(accountNo, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return super.calculateInterest() + (getBalance() * 0.01);
    }

    public double calculateInterest(double rate) {
        return getBalance() * rate;
    }
}
