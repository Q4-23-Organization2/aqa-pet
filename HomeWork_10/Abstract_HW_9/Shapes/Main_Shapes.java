package HomeWork_10.Abstract_HW_9.Shapes;

public class Main_Shapes {
    public static void main(String[] args) {
        Shapes[] shapesArray = new Shapes[3];
        shapesArray[0] = new CircleShape("Yellow", 11.12);
        shapesArray[1] = new RectangleShape("Purple", 12.34, 56.78);
        shapesArray[2] = new TriangleShape("White", 9.8, 7.6, 5.4);

        for (Shapes shape : shapesArray) {
            System.out.println("Shape: " + getShapeName(shape));
            System.out.println("Area: " + shape.calculateArea());
            System.out.println("Perimeter: " + shape.calculatePerimeter());
            shape.paint();
            System.out.println("ToString: " + shape.toString());
            System.out.println("HashCode: " + shape.hashCode());
        }

        //Compare two identical figures using the equals method:
        Shapes shape1 = new CircleShape("Yellow", 12.13);
        Shapes shape2 = new CircleShape("Yellow", 12.13);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Equals of two identical shapes is: " + shape1.equals(shape2));
    }

    private static String getShapeName(Shapes shape) {
        if (shape instanceof CircleShape) {
            return "Circle";
        } else if (shape instanceof RectangleShape) {
            return "Rectangle";
        } else if (shape instanceof TriangleShape) {
            return "Triangle";
        } else {
            return "Unknown shape";
        }
    }
}
