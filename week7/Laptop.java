package week7;


/**
 * Write a description of class laptop here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Laptop {
    String brand;
    int ram;       
    double price;  

    Laptop(String brand, int ram, double price) {
        this.brand = brand;
        this.ram = ram;
        this.price = price;
    }

    void display() {
        System.out.println("Brand: " + brand + ", RAM: " + ram + "GB, Price: $" + price);
        
    }
}
