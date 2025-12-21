package week7;


/**
 * Write a description of class employee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class  Employee {
    int id;
    String name;
    double salary;

  
    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }


    void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
    }
}

