package week10;


/**
 * Write a description of class onlinedeliveryfoodsystem here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Deliverysystem{

    public static void main(String[] args) {

        BikeDelivery bike = new BikeDelivery(101, "Ramesh", 8000);
        CarDelivery car = new CarDelivery(102, "Suresh", 10000);

        System.out.println(bike);
        System.out.println("Bike Payment: " + bike.calculatePayment());
        System.out.println("Bike Payment (Extra Orders): " + bike.calculatePayment(3));

        System.out.println();

        System.out.println(car);
        System.out.println("Car Payment: " + car.calculatePayment());
        System.out.println("Car Payment (Extra Orders): " + car.calculatePayment(2));
    }
}

