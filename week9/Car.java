package week9;


/**
 * Write a description of class car here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Car extends Vehicle {
    int numberOfDoors;
    String fuelType;

    Car(int vehicleId, String brand, double basePrice, int numberOfDoors, String fuelType) {
        super(vehicleId, brand, basePrice);
        this.numberOfDoors = numberOfDoors;
        this.fuelType = fuelType;
    }

    double calculateFinalPrice() {
        return basePrice + calculateTax() + (basePrice * 0.05);
    }

    void displayCarInfo() {
        displayVehicleInfo();
        System.out.println("Number of Doors: " + numberOfDoors);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Tax: " + calculateTax());
        System.out.println("Final Price: " + calculateFinalPrice());
    }
}

