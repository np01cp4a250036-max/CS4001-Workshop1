
/**
 * Write a description of class scenarioqueation here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class scenarioqueation
{
    

public class FixedDepositNIB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 1;

        while (true) {
            System.out.println("FD Calculation #" + count);
            System.out.print("Enter deposit amount (minimum Rs. 1000): ");
            double principal = scanner.nextDouble();
            if (principal < 1000) {
                System.out.println("Deposit must be at least Rs. 1000.");
                continue;
            }
            System.out.print("Enter duration in years (maximum 5 years): ");
            int years = scanner.nextInt();
            if (years > 5 || years <= 0) {
                System.out.println("Duration must be between 1 and 5 years.");
                continue;
            }
            System.out.print("Enter annual interest rate (8% to 12%): ");
            double annualRate = scanner.nextDouble();
            if (annualRate < 8 || annualRate > 12) {
                System.out.println("Interest rate must be between 8% and 12%.");
                continue;
            }
            double monthlyRate = annualRate / 12 / 100;
            int months = years * 12;
            double amount = principal * Math.pow(1 + monthlyRate, months);
            double fee = 0.005 * amount;
            double finalAmount = amount - fee;

            System.out.printf("Final amount after %d years (with 0.5%% fee): Rs. %.2f%n", years, finalAmount);

            System.out.print("Do you want to perform another FD calculation? (yes/no): ");
            String response = scanner.next();
            if (!response.equalsIgnoreCase("yes")) {
                break;
            }
            count++;
        }

        scanner.close();
        System.out.println("Thank you for using FixedDepositNIB!");
    }
}
}