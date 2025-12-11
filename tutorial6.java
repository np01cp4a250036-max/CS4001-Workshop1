
/**
 * Write a description of class tutorial6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class tutorial6
{
    public static void main(String []args){
    int [] age; //declaring an array
    age = new int[5]; //constructin to an array
    System.out.println(age.length);
    
    age[0]=10; //initializing an array elements
    age[1]=20;
    age[2]=30;
    age[3]=40;
    age[4]=50;
    
    int firstElement=age[0];
    System.out.println(firstElement);
    
    int lastElement =age[4];
    System.out.println(lastElement);
    
    int [] agr={10,20,30,40,50};
    for(int i=0;i<agr.length;i++) {
    
    System.out.println(agr[i]);
    }
    
    for(int i=5;i>agr.length;i--){
    System.out.println(agr[i]);
    }
    int lastIndex=agr.length-1;
    int firstIndex=0;
    
    int  sum=0;
    for(int i=0;i<agr.length;i++){
    sum=sum+agr[i];
    }
    System.out.println(sum);
    int[] revAgr=new int[agr.length];
    int j=0;
    for(int i=agr.length-1;i>=0;i--){
    
    
    
    }




}}