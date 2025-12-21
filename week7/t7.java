package week7;


/**
 * Write a description of class t7 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class t7
{
    public static void main(String [] args){
    // classname variable=new className();
    student s1= new student();
    s1.collegeId= 1011;
    s1.name="Suhan";
    s1.age=16;
    
    s1.study();
    System.out.println(s1.collegeId);
    System.out.println(s1.name);
    System.out.println(s1.age);
    
    student s2= new student();
    s2.collegeId=2011;
    s2.name="kalu";
    s2.age=16;
    
    System.out.println(s2.collegeId);
    System.out.println(s2.name);
    System.out.println(s2.age);
    
    car c1=new car();
    c1.CarNo=11;
    c1.name="Ferari";
    c1.myear=2009;
    c1.mileage=25;
    c1.speed();
    System.out.println(c1.CarNo);
    System.out.println(c1.name);
    System.out.println(c1.myear);
    System.out.println(c1.mileage);
    
    car c2= new car();
    c2.CarNo=1212;
    c2.name="Buggati";
    c2.myear=2020;
    c2.mileage=10;
    System.out.println(c2.CarNo);
    System.out.println(c2.name);
    System.out.println(c2.myear);
    System.out.println(c2.mileage);
    
    
    
    
    
    
    
    }
}