package wek11;


/**
 * Write a description of class Mainj here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MainJ {
    public static void main(String[] args) {

        Crop[] crops = {
            new Rice(1.5),
            new Wheat(1.0),
            new Maize(0.8)
        };

        for (Crop crop : crops) {
            crop.displayCropInfo();

            if (crop instanceof Transportable) {
                Transportable t = (Transportable) crop;
                System.out.println("Transport Method: " + t.getTransportMethod());
                System.out.println("Transport Cost: Rs. " + t.calculateTransportCost());
            }

            System.out.println("-----------------------------");
        }
    }
}
