
/**
 * Write a description of class w6q5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class w6q5 {
    public static void main(String[] args) {

        String[] districts = {"Morang", "Kathmandu", "Kaski", "Sindhuli"};

        System.out.println("Static Districts:");
        for (int i = 0; i < districts.length; i++) {
            System.out.println((i + 1) + ". " + districts[i]);
        }

        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter number of districts: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] dynamicDistricts = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("District " + (i + 1) + ": ");
            dynamicDistricts[i] = sc.nextLine();
        }

        System.out.println("\nUpdated District List:");
        for (int i = 0; i < dynamicDistricts.length; i++) {
            System.out.println((i + 1) + ". " + dynamicDistricts[i]);
        }

        sc.close();
    }
}

