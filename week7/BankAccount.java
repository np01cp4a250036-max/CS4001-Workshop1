package week7;


/**
 * Write a description of class BankAccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankAccount
{
    int Accountnumber;
    String holdername;
    double balance;
    
    
    void deposit(double amount){
    balance = balance+ amount; 
}
    void withdraw(double amount){
    balance = balance - amount;
    }
    
    void showbalance() {
        System.out.println(holdername + "Balance" +balance );
      
    }
    
    
}