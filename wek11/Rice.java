package wek11;


/**
 * Write a description of class Rice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Rice extends Crop implements Transportable {

    public Rice(double landArea) {
        super("Rice", "Monsoon", landArea);
    }

    @Override
    public double calculateYield() {
        return landArea * 4.5;
    }

    @Override
    public double calculateWaterRequirement() {
        return landArea * 1200;
    }

    @Override
    public double calculateTransportCost() {
        return landArea * 1500;
    }

    @Override
    public String getTransportMethod() {
        return "Tractor / Rural Truck";
    }
}
