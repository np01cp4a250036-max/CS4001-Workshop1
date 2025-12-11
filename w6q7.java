
/**
 * Write a description of class w6q7 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class w6q7{
     public static void main(String[] args) {
        String[][] seats = new String[2][3]; 

        seats[0][0] = "Suhan";
        seats[0][1] = "Ram";
        seats[0][2] = "Hari";

        for (int i = 0; i < 2; i++) {
            System.out.print("Row " + (i + 1) + ": ");
            for (int j = 0; j < 3; j++) {
                if (seats[i][j] == null || seats[i][j].isEmpty()) {
                    System.out.print("[empty] ");
                } else {
                    System.out.print("[" + seats[i][j] + "] ");
                }
            }
            System.out.println();
        }
    }
}