package week9;


/**
 * Write a description of class payroll here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Payroll {
    public static void main(String[] args) {
       
        PermanentEmployee pemp = new PermanentEmployee(1, "Suhan", 50000, 10000, 5000);

       
        ContractEmployee comp = new ContractEmployee(2, "Rita", 3000, 20);

        System.out.println("---- Permanent Employee Details ----");
        pemp.displayPermanentEmployee();

        System.out.println();

        System.out.println("---- Contract Employee Details ----");
        comp.displayContractEmployee();
    }
}
