package week9;


/**
 * Write a description of class contractemployee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ContractEmployee extends Employee {
    int workingDays;

    ContractEmployee(int employeeId, String name, double basicSalary, int workingDays) {
        super(employeeId, name, basicSalary); // call parent constructor
        this.workingDays = workingDays;
    }

    double calculateTotalSalary() {
        return basicSalary * workingDays;
    }

    void displayContractEmployee() {
        displayEmployee(); // display parent info
        System.out.println("Working Days: " + workingDays);
        System.out.println("Total Salary: " + calculateTotalSalary());
    }
}
