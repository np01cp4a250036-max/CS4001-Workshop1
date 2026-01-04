package week8;


/**
 * Write a description of class w8 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class w8
{
   public static void main(String [] args){
    calculator calc= new calculator();
    calc.displayinfo();
    calc.add(10,20); //actual parameters
    
    calc.getfixednumber();
    System.out.println("The fixed number is: "+calc.getfixednumber());
    
    int fixnum=calc.getfixednumber();
    System.out.println("The fixed number is"+fixnum);
    
    int mul=calc.multiply(10,20);
    int mul1=calc.multiply(30,40);
    
    //static method invocation or calling static methods
    int sqr=calculator.square(20);  
    System.out.println("The squarw of given number is" +sqr);
    
}
}