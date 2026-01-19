package week10;


/**
 * Write a description of class nurse here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class nurse extends person
{
    private String shift;
    private int extraAllowance;

    public nurse(int id, String name, String shift, int extraAllowance) {
        super(id, name);
        this.shift = shift;
        this.extraAllowance = extraAllowance;
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() + extraAllowance;
    }

    @Override
    public String toString() {
        return super.toString() +
               ", Shift: " + shift +
               ", Extra Allowance: " + extraAllowance;
    }
}

