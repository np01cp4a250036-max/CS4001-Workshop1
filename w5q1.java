
/**
 *Q.1.Write a program to display the series of 2, 4, 6 .......up to 10th term
using for loop, while loop and do-while loop. a description of class w1q1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class w5q1  {
    public static void main(String[] args) {
        int i;

        // Using for loop
        System.out.println("Series using for loop:");
        for (i = 1; i <= 10; i++) {
            System.out.print(2 * i + " ");
        }
        System.out.println("/n");

        // Using while loop
        System.out.println("Series using while loop:");
        i = 1;
        while (i <= 10) {
            System.out.print(2 * i + " ");
            i++;
        }
        System.out.println("\n");

        // Using do-while loop
        System.out.println("Series using do-while loop:");
        i = 1;
        do {
            System.out.print(2 * i + " ");
            i++;
        } while (i <= 10);
        System.out.println();
    }
}