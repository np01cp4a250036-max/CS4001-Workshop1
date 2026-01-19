package week10;


/**
 * Write a description of class cardelivery here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CarDelivery extends DeliveryPartner {

    public CarDelivery(int partnerId, String name, double basePay) {
        super(partnerId, name, basePay);
    }

    @Override
    public double calculatePayment() {
        return super.calculatePayment() + 3000;
    }

    public double calculatePayment(int extraOrders) {
        return calculatePayment() + (extraOrders * 400);
    }
}
