
/**
 * WAP to find the sum of the square of first 10 natural numbers. use
do-while loop.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class w5q3 {
    public static void main(String[] args) {
        int i = 1;          
        int sum = 0;        

        do {
            sum += i * i;   
            i++;            
        } while (i <= 10); 

        System.out.println("Sum of squares of first 10 natural numbers = " + sum);
    }
}