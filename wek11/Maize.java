package wek11;


/**
 * Write a description of class Maize here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Maize extends Crop implements Transportable {

    public Maize(double landArea) {
        super("Maize", "Summer", landArea);
    }

    @Override
    public double calculateYield() {
        return landArea * 2.8;
    }

    @Override
    public double calculateWaterRequirement() {
        return landArea * 500;
    }

    @Override
    public double calculateTransportCost() {
        return landArea * 800;
    }

    @Override
    public String getTransportMethod() {
        return "Porter / Small Vehicle";
    }
}
