package week10;


/**
 * Write a description of class universityexamination here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ExamApp {

    public static void main(String[] args) {

        ScienceStudent s1 = new ScienceStudent(1, "Amit", 38);
        ManagementStudent m1 = new ManagementStudent(2, "Rita", 36);

        System.out.println(s1);
        System.out.println("Result: " + s1.calculateResult());
        System.out.println("Result with Grace: " + s1.calculateResult(2));

        System.out.println();

        System.out.println(m1);
        System.out.println("Result: " + m1.calculateResult());
        System.out.println("Result with Grace: " + m1.calculateResult(4));
    }
}
