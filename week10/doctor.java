package week10;


/**
 * Write a description of class doctor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class doctor extends person
{
     private String specialization;
     private int consultationfee;
     
     public doctor(int id, String name,String specialization,int consultationfee){
        super(id, name);
        this.specialization=specialization;
        this.consultationfee=consultationfee;
        }
        @Override
    public double calculateSalary() {
        return super.calculateSalary() + consultationfee;
    }

    public double calculateSalary(int emergencyCases) {
        return calculateSalary() + (emergencyCases * 500);
    }

    @Override
    public String toString() {
        return super.toString() +
               ", Specialization: " + specialization +
               ", Consultation Fee: " + consultationfee;
    }
}
    
