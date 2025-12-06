
/**
 * 
 *WAP to display the square of first 10 natural numbers. Use while loop
 * @author (your name)
 * @version (a version number or a date)
 */
public class w5q2 extends w5q5 {
    public static void main(String[] args) {
        int i = 1;  // starting from the first natural number

        System.out.println("Squares of the first 10 natural numbers:");

        while (i <= 10) {
            System.out.println(i + "square of = " + (i * i));
            i++;  // increment to the next number
        }
    }
}