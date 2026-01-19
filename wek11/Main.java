package wek11;


/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main {
    public static void main(String[] args) {

        Shape[] shapes = new Shape[2];
        shapes[0] = new Rectangle(5, 3);
        shapes[1] = new Circle(4);

        for (Shape shape : shapes) {
            shape.displayShapeInfo();

            if (shape instanceof Drawable) {
                ((Drawable) shape).draw();
            }

            System.out.println("--------------------");
        }
    }
}
