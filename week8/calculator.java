package week8;


/**
 * Write a description of class calculator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class calculator
{
    //instance methods
    
    //<access modifier> <method-type> <return-type><method-name>:(para or no para)
    //void return type+ no parameters
    //method o verloading
    public void displayinfo(){
         System.out.println("Welcome to calculator app.");
    }
    public void add(int a, int b) //formal parameters 
    {
         System.out.println("The sum of two numbers are "+(a+b));
   }
   public void add(double a,double b){
      System.out.println("The sum of two numbers are:" +(a+b));
      
    
    }
   public void add(int a, int b,int c){
      System.out.println("The sum of three numbers are:" +(a+b+c));
    
    }
   //return type + no parameters
   public int getfixednumber(){
    return 10 ;
    }
    
    //return type + parameters
    public int multiply(int a, int b)
    { 
        return  a*b;
    }
    // static --> return type + parameters
    public static int square(int a){
    return a*a;
    }
}
