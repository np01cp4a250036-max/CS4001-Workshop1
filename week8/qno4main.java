package week8;


/**
 * Write a description of class qno4main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class qno4main
{
     public static void main(String[] args) {
        
        shoppingcart cart = new shoppingcart("T-Shirt", 1500.0, 2);

        System.out.println("---- Shopping Cart Details ----");
        cart.displayCart();

        
        cart.setQuantity(3);
        System.out.println("\nUpdated Quantity: " + cart.getQuantity());
        System.out.println("Updated Total Price: Rs. " + cart.calculateTotal());

        
        double discountedTotal = cart.calculateDiscountedTotal(10);
        System.out.println("\nPrice After 10% Discount: Rs. " + discountedTotal);
    }
}