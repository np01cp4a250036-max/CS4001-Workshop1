package week10;


/**
 * Write a description of class course here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class course
{
    int courseId;
    String courseName;
    protected double baseFee;
    
    public course(int courseId, String courseName, double baseFee){
    this.courseId=courseId;
    this.courseName=courseName;
    this.baseFee=baseFee;
    
    }
    public void setcourseId(int newId){
    this.courseId=newId;
    
    }
    public int getCourseId(){
    return this.courseId;
    
    }
    public void getcourseName(String courseName){
    this.courseName=courseName;
    }
    public String getCourseName(){
    return this.courseName;
    }
    
    //method overloading --> compile time polymorphism
    
    public double calculatefee(){
    return this.baseFee;
    
    }
    public void displaycourse(){
    System.out.println("Course ID"+ this.courseId);
    System.out.println("Course Name"+ this.courseName);
    
    }


}