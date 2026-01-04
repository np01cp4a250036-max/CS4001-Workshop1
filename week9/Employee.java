package week9;


/**
 * Write a description of class Employees here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Employee {
    int employeeId;
    String name;
    double basicSalary;

    // Constructor
    Employee(int employeeId, String name, double basicSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    // Bonus = 10% of basicSalary
    double calculateBonus() {
        return basicSalary * 0.10;
    }

    // Display employee details
    void displayEmployee() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
    }
}

