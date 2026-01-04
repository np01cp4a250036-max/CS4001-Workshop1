package week8;


/**
 * Write a description of class electricitybill here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class ElectricityBill {
    private String consumerName;
    private int unitsConsumed;

    
    public ElectricityBill(String consumerName, int unitsConsumed) {
        this.consumerName = consumerName;
        this.unitsConsumed = unitsConsumed;
    }

    
    public void setUnitsConsumed(int unitsConsumed) {
        this.unitsConsumed = unitsConsumed;
    }

    
    public int getUnitsConsumed() {
        return unitsConsumed;
    }

    
    public double calculateBill() {
        double billAmount;
        if (unitsConsumed <= 100) {
            billAmount = unitsConsumed * 5;
        } else {
            
            billAmount = (100 * 5) + ((unitsConsumed - 100) * 8);
        }
        return billAmount;
    }

    
    public void displayBill() {
        System.out.println("Consumer Name: " + consumerName);
        System.out.println("Units Consumed: " + unitsConsumed);
        System.out.println("Total Bill Amount: ₹" + calculateBill());
    }
}
