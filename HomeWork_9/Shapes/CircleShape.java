package HomeWork_9.Shapes;

import java.util.Scanner;

public class CircleShape extends Shapes {
    public CircleShape() {
        super();
    }

    public static void main(String[] args)
    {
        Scanner crCir = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = crCir.nextDouble();
        //Площадь круга вычисляется по формуле = PI*radius*radius
        double area = Math.PI * (radius * radius);
        System.out.println("The area of the circle is: " + area);
        //Длины окружности вычисляется по формуле = 2*PI*radius
        double circumference= Math.PI * 2*radius;
        System.out.println("The circumference is equal to: " + circumference) ;
    }
}
