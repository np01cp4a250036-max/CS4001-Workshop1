package week8;


/**
 * Write a description of class bank here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ATM  {
   public class Atm {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("123456789", 5000.0, "Suhan");

        acc.displayAccount();

        System.out.println("\n--- Transactions ---");
        acc.deposit(1000);
        acc.withdraw(2000);
        acc.withdraw(5000); 

        System.out.println("\nFinal Balance: " + acc.getBalance());
    }
}
}
