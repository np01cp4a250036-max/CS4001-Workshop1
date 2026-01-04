package week9;


/**
 * Write a description of class mainmethod here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankApp {
    public static void main(String[] args) {

       
        SavingAccount sAcc = new SavingAccount(101, "Suhan", 50000, 5); 
        System.out.println("---- Savings Account ----");
        sAcc.displaySavingAccount();
        sAcc.deposit(10000);
        System.out.println("Balance after deposit: " + sAcc.getBalance());
        System.out.println("Interest: " + sAcc.calculateInterest());

        System.out.println();

       
        CurrentAccount cAcc = new CurrentAccount(102, "Rita", 20000, 5000); 
        System.out.println("---- Current Account ----");
        cAcc.displayCurrentAccount();
        cAcc.deposit(5000);
        System.out.println("Balance after deposit: " + cAcc.getBalance());
        cAcc.withdraw(25000); 
        System.out.println("Balance after withdrawal: " + cAcc.getBalance());
        cAcc.withdraw(10000);
    }
}
