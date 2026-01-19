package week10;


/**
 * Write a description of class offlinecourse here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class offlinecourse extends course
{
  private double labFee;
    
    public offlinecourse(int courseId, String courseName, double baseFee,double labFee){
    super(courseId,  courseName,  baseFee);
    this.labFee=labFee;
    
    }
    @Override
    public double  calculatefee(){
    return super.baseFee+labFee;
    }
}