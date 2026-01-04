package week9;


/**
 * Write a description of class main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class VehicleApp {
    public static void main(String[] args) {

        Car car = new Car(1, "Honda", 3000000, 4, "Petrol");
        Bike bike = new Bike(2, "Yamaha", 450000, 150);

        System.out.println("---- Car Details ----");
        car.displayCarInfo();

        System.out.println();

        System.out.println("---- Bike Details ----");
        bike.displayBikeInfo();
    }
}

