package week8;

public class student{
    private String name;
    private int id;
    private String address;
    private long pno;
    static String collegename;
    
    public student(String name,int id,String address,long pno){
    this.name=name;
    this.id=id;
    this.address=address;
    this.pno=pno;
    }
    
    
    
    
    
    
    
    
    
    
    //setters and getters method
    public void setname(String name)
    {
        this.name=name;
    }
    public String getname()
    {
        return this.name;
    }
    
    public void setid(int id){
        this.id=id;
    }
    public int getit(){
    return this.id;
    }
    public void setaddress(String address){
    this.address=address;
    }
    
    public String getaddress(){
       return this.address; 
    }
    public void setpno(long pno){
        this.pno=pno;
    }
    public Long pno(){
        return this.pno;
    }
    
    
    
    //diplay student details
    public void displayinfo(){
        System.out.println("Name of the student is"+this.name);
        System.out.println("Id of the student is"+this.id);
        System.out.println("address of the student is"+this.address);
        System.out.println("phone number of the student is"+this.pno);
        System.out.println("college of the student is "+ collegename);
        System.out.println("-------------");
        
    }
    
}