package week9;


public class Bike extends Vehicle {
    int engineCapacity;

    Bike(int vehicleId, String brand, double basePrice, int engineCapacity) {
        super(vehicleId, brand, basePrice);
        this.engineCapacity = engineCapacity;
    }

    double calculateFinalPrice() {
        return basePrice + calculateTax();
    }

    void displayBikeInfo() {
        displayVehicleInfo();
        System.out.println("Engine Capacity: " + engineCapacity + " cc");
        System.out.println("Tax: " + calculateTax());
        System.out.println("Final Price: " + calculateFinalPrice());
    }
}

