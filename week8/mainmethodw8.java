package week8;


/**
 * Write a description of class mainmethodw8 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class mainmethodw8
{
    public static void main(String [] args){
    student st1=new student("shubham",101,"gokarna",234565677);
    st1.displayinfo();
    
    st1.setname("hapsi");
    st1.setid(101);
    st1.setaddress("gokarna");
    st1.setpno(999999999);
    st1.collegename=("islington college");
    
    st1.displayinfo();
    }
}