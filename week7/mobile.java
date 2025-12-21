package week7;


/**
 * Write a description of class mobile here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class mobile
{
   String brand;
   int price;
   
   boolean isAffordable() {
       return price<20000;
       
   }
}