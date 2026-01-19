package week10;


/**
 * Write a description of class managementstudent here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ManagementStudent extends Student {

    public ManagementStudent(int rollNo, String name, int marks) {
        super(rollNo, name, marks);
    }

    @Override
    public String calculateResult() {
        if (getMarks() + 3 >= 40) {
            return "Pass (Management)";
        }
        return super.calculateResult();
    }

    public String calculateResult(int graceMarks) {
        return (getMarks() + graceMarks >= 40) ? "Pass with Grace (Management)" : "Fail";
    }
}
