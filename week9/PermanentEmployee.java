package week9;


/**
 * Write a description of class permaenetemployee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

    public class PermanentEmployee extends Employee {
    double hra;
    double da;

    PermanentEmployee(int employeeId, String name, double basicSalary, double hra, double da) {
        super(employeeId, name, basicSalary); // call parent constructor
        this.hra = hra;
        this.da = da;
    }

    double calculateTotalSalary() {
        return basicSalary + hra + da + calculateBonus();
    }

    void displayPermanentEmployee() {
        displayEmployee(); // display parent info
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("Bonus: " + calculateBonus());
        System.out.println("Total Salary: " + calculateTotalSalary());
    }
}
