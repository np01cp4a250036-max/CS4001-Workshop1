import java.util.*;

/**
 * Write a description of class w6q3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class w6q3
{
    public static void main(String[] args) {

        String[] students = {"Saroj", "Sushant", "Ujjwal", "Rabina", "Sandesh"};

        System.out.println("All Students:");
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }

        System.out.println("\nName at index 2: " + students[2]);

        students[4] = "Prakash";
        System.out.println("Updated name at index 4: " + students[4]);

        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter a new name to update index 1: ");
        String newName = sc.nextLine();
        students[1] = newName;

        System.out.println("\nUpdated Student List:");
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }

        sc.close();
    }








}
    
    
    
    
    
    
    
    
    
    
    
