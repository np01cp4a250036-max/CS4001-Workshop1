
/**
 * Write a description of class w6q6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;

public class w6q6 {
    public static void main(String[] args) {
        int[][] marks = {
            {80, 75},
            {90, 85}
        };

        System.out.println("Student\tNepali\tEnglish");
        for (int i = 0; i < 2; i++) {
            System.out.print("S" + (i + 1) + "\t");
            System.out.print(marks[i][0] + "\t");
            System.out.println(marks[i][1]);
        }

        System.out.println();
        for (int i = 0; i < 2; i++) {
            int total = marks[i][0] + marks[i][1];
            System.out.println("Total marks of Student " + (i + 1) + ": " + total);
        }
    }
}