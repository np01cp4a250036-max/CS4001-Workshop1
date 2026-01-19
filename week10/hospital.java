package week10;


/**
 * Write a description of class hospital here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class hospital
{
   public class HospitalApp {

    public static void main(String[] args) {

        doctor d = new doctor(1, "Dr. Ram", "Cardiology", 5000);
        nurse n = new nurse(2, "Sita", "Night", 2000);

        System.out.println(d);
        System.out.println("Doctor Salary: " + d.calculateSalary());
        System.out.println("Doctor Salary (Emergency): " + d.calculateSalary(3));

        System.out.println();

        System.out.println(n);
        System.out.println("Nurse Salary: " + n.calculateSalary());
    }
}
}