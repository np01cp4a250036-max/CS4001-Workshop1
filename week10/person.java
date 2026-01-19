package week10;


/**
 * Write a description of class person here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class person
{
  private int id;
  private String name;
  
  public person(int id, String name){
    this.id=id;
    this.name=name;
    
    }
    public void  settid(int newid){
     this.id=newid;   
    }
    
    public int getid(){
    return this.id;
    }
    
    public void setname(String name){
    this.name=name;
    }
    
    public String getname(){
    return this.name;
    }
    
    public double calculateSalary(){
    return 0.0;
    }
    
    @Override 
    public String toString(){
      return "person details -> id: " + this.getid() + ", name: " + this.getname();
    }
    
}