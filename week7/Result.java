package week7;


/**
 * Write a description of class Result here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Result
{
 int subject1;
 int subject2;
 int subject3;
 int total;
double percentage;
void totalmmarks() {
 total=subject1+subject2+subject3;
}
void Percentage(){
percentage=(total/300)*100;}
void Printresult(){
System.out.println("Subject1"+subject1);
System.out.println("Subject2"+subject2);
System.out.println("Subeject3"+subject3);
System.out.println("totalmarks:"+total);
System.out.println("Percentage"+percentage);

}



} 


