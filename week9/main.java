package week9;


/**
 * Write a description of class Schoolapp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class main {
    public static void main(String[] args) {

        
        Teacher teacher = new Teacher(1, "Suhan", 5000, "Math", 2000);
        System.out.println("---- Teacher Info ----");
        teacher.displayTeacherInfo();

        System.out.println();

        
        Staff staff = new Staff(2, "Rita", 3000, 160, 20); 
        System.out.println("---- Staff Info ----");
        staff.displayStaffInfo();

        System.out.println();

        System.out.println("College Name: " + Person.collegeName);
    }
}
