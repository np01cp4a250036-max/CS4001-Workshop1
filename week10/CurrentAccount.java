package week10;


/**
 * Write a description of class currentapp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CurrentAccount extends Account {

    public CurrentAccount(int accountNo, String holderName, double balance) {
        super(accountNo, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return super.calculateInterest();
    }

    public double calculateInterest(double rate) {
        return getBalance() * rate;
    }
}
