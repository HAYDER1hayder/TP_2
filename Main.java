
public class Main {

    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(4, 6);
        shapes[2] = new Triangle(3, 8);

        for (Shape shape:shapes) {

            System.out.println("Area: " + shape.calculateArea());

            shape.display();

            System.out.println("---");
        }
    }

}