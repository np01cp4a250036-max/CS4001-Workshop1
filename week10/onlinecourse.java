package week10;


/**
 * Write a description of class onliecourse here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class onlinecourse extends course{
    private double platformFee;
    
    public onlinecourse(int courseId, String courseName, double baseFee,double platformFee){
    super(courseId,  courseName,  baseFee);
    this.platformFee=platformFee;
    
    }
    @Override
    public double calculatefee(){
    return this.baseFee+platformFee;
    
    }

}