package week10;


/**
 * Write a description of class Bankapp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Bankapp
{
    public class BankApp {

    public static void main(String[] args) {

        SavingsAccount sa = new SavingsAccount(101, "Ram", 50000);
        CurrentAccount ca = new CurrentAccount(102, "Sita", 70000);

        System.out.println(sa);
        System.out.println("Savings Interest: " + sa.calculateInterest());
        System.out.println("Savings Interest (Custom Rate): " + sa.calculateInterest(0.05));

        System.out.println();

        System.out.println(ca);
        System.out.println("Current Interest: " + ca.calculateInterest());
        System.out.println("Current Interest (Custom Rate): " + ca.calculateInterest(0.03));
    }
}

}