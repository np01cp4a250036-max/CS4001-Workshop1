
import java.util.Scanner;

/**
 * Write a description of class w5q8 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class w5q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Multiplication Table of " + num + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }

        sc.close();
    }
}
    