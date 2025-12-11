
import java.util.*;

/**
 * Write a description of class w6q5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class w6q4
{
      public static void main(String[] args) {

        int[] scores = {10, 20, 30, 40, 50};

        System.out.println("Static Scores:");
        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);
        }

        int sum = 0;
        for (int value : scores) {
            sum += value;
        }
        System.out.println("\nSum: " + sum);

        double average = (double) sum / scores.length;
        System.out.println("Average: " + average);

        int highest = scores[0];
        int lowest = scores[0];

        for (int v : scores) {
            if (v > highest) highest = v;
            if (v < lowest) lowest = v;
        }

        System.out.println("Highest: " + highest);
        System.out.println("Lowest: " + lowest);

        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter number of subjects: ");
        int n = sc.nextInt();

        int[] dynamicScores = new int[n];

        System.out.println("Enter scores:");
        for (int i = 0; i < n; i++) {
            System.out.print("Score " + (i + 1) + ": ");
            dynamicScores[i] = sc.nextInt();
        }

        System.out.println("\nUpdated Scores:");
        for (int value : dynamicScores) {
            System.out.println(value);
        }

        sc.close();
    }
}