package week10;


/**
 * Write a description of class sciencestudent here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ScienceStudent extends Student {

    public ScienceStudent(int rollNo, String name, int marks) {
        super(rollNo, name, marks);
    }

    @Override
    public String calculateResult() {
        if (getMarks() + 5 >= 40) {
            return "Pass (Science)";
        }
        return super.calculateResult();
    }

    public String calculateResult(int graceMarks) {
        return (getMarks() + graceMarks >= 40) ? "Pass with Grace (Science)" : "Fail";
    }
}
