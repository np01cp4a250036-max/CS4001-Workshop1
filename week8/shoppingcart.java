package week8;


/**
 * Write a description of class shoppitngcart here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class shoppingcart
{
    private String itemName;
    private double itemPrice;
    private int quantity;

    // Constructor to initialize attributes
    public shoppingcart(String itemName, double itemPrice, int quantity) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.quantity = quantity;
    }

    // Setter for quantity
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Getter for quantity
    public int getQuantity() {
        return quantity;
    }

    // Method to calculate total price
    public double calculateTotal() {
        return itemPrice * quantity;
    }

    // Method to calculate discounted total
    public double calculateDiscountedTotal(double discountPercent) {
        double discount = calculateTotal() * (discountPercent / 100);
        return calculateTotal() - discount;
    }

    // Display all cart details
    public void displayCart() {
        System.out.println("Item Name: " + itemName);
        System.out.println("Item Price: Rs. " + itemPrice);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Price: Rs. " + calculateTotal());
    }
}