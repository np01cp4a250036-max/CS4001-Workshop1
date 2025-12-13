
/**
 * Write a description of class scenario_question_hw here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class scenario_question_hw
{
    public static void main (String [] args){
    
        String[] categories = {"Fiction", "Nepali"};

        String[][] titles = new String[2][1];
        double[][] prices = new double[2][1];

        titles[0][0] = "Asahamati - 5";
        prices[0][0] = 750.0;

        titles[1][0] = "Muna Madan";
        prices[1][0] = 500.0;

        for (int i = 0; i < categories.length; i++) {
            System.out.println(categories[i]);
            System.out.println(titles[i][0]);
            System.out.printf("%.2f%n", prices[i][0]);
        }
    }
}

    
    
    
    