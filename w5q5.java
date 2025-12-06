
/**
 * WAP to display the following pattern by using for loop.
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class w5q5 {
    public static void main(String[] args) {
        int n = 5;          
        for (int i = 1; i <= n; i++) {

           
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }

           
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            
            System.out.println();
        }
    }
}
        
        
        
        
        
        
        
        
 