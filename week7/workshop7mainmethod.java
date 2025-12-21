package week7;


/**
 * Write a description of class workshop7q1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class workshop7mainmethod

{
    public static void main(String [] args){
    book b1= new book();
    b1.titlename="hehe";
    b1.authorname="Anushreet";
    b1.price=999;
    System.out.println(b1.titlename);
    System.out.println(b1.authorname);
    System.out.println(b1.price);
    
    book b2= new book();
    b2.titlename="The kalu";
    b2.authorname="hapsi";
    b2.price=1111;
    System.out.println(b2.titlename);
    System.out.println(b2.authorname);
    System.out.println(b2.price);
    
    
    rectangle r1= new rectangle ();
    r1.length=15.99;
    r1.breadth=14.678;
    
    rectangle r2= new rectangle();
    r2.length=99.8;
    r2.breadth=34.45;
 
    System.out.println(r1);
    System.out.println(r2);

        Employee emp1 = new Employee(101, "Alice", 50000);
        Employee emp2 = new Employee(102, "Bob", 60000);
        Employee emp3 = new Employee(103, "Charlie", 55000);

        
        emp1.display();
        emp2.display();
        emp3.display();

        
        Employee highest = emp1;
        if (emp2.salary > highest.salary) {
            highest = emp2;
        }
        if (emp3.salary > highest.salary) {
            highest = emp3; 
        }

        System.out.println("\nEmployee with highest salary:");
        highest.display();
        
        Laptop l1 = new Laptop("Dell", 16, 800);
        Laptop l2 = new Laptop("HP", 8, 700);
        Laptop l3 = new Laptop("Lenovo", 12, 750);

        System.out.println("Laptops with RAM greater than 8GB:");
        if (l1.ram > 8) {
            l1.display();
        }
        if (l2.ram > 8) {
            l2.display();
        }
        if (l3.ram > 8) {
            l3.display();
        }
        
        
        
        mobile m1= new mobile();
        m1.brand ="nokia";
        m1.price=30000;
        
        mobile m2= new mobile();
        m2.brand="apple";
        m2.price=80000;
        
        mobile m3=new mobile();
        m3.brand="samsung";
        m3.price=20000;
        
        System.out.println(m1.brand + " " + m1.isAffordable());
        System.out.println(m2.brand + " " + m2.isAffordable());
        System.out.println(m3.brand + " " + m3.isAffordable());
        
        Result t1= new Result();
        t1.subject1=80;
        t1.subject2=70;
        t1.subject3=90;
        t1.totalmmarks();
        t1.Percentage();
        
         Result t2 = new Result();
        t2.subject1 = 65;
        t2.subject2 = 75;
        t2.subject3 = 85;
        t2.totalmmarks();
        t2.Percentage();
        
        
        BankAccount ba1= new BankAccount();
        BankAccount ba2= new BankAccount();
        
        ba1.holdername="suhan";
        ba1.balance=1000;
        
        ba2.holdername="nigga";
        ba2.balance=5000;
        
        ba1.deposit(500);
        ba1.withdraw(200);
        
        ba2.deposit(500);
        ba2.withdraw(800);
        
        ba1.showbalance();
        ba2.showbalance();
        
        
        
    }
}

    
    