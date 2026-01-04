package week8;


/**
 * Write a description of class mainelployhee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class Employee {
    private double basicSalary;

    
    public Employee(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    
    public double calculateGrossSalary() {
        double bonus = basicSalary * 0.20; 
        return basicSalary + bonus;        
    }

    public void displayDetails() {
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Gross Salary: " + calculateGrossSalary());
    }
}