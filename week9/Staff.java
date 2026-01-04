package week9;


/**
 * Write a description of class staff here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Staff extends Person {
    int workingHours;
    double ratePerHour;

    Staff(int id, String name, double basicSalary, int workingHours, double ratePerHour) {
        super(id, name, basicSalary); 
        this.workingHours = workingHours;
        this.ratePerHour = ratePerHour;
    }

    double calculateSalary() {
        return workingHours * ratePerHour;
    }

    void displayStaffInfo() {
        displayPersonInfo(); 
        System.out.println("Working Hours: " + workingHours);
        System.out.println("Rate per Hour: " + ratePerHour);
        System.out.println("Salary: " + calculateSalary());
    }
}
