package HomeWork_9;

import java.awt.*;
import java.util.Scanner;

public class RectangleShape extends Shapes {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        Scanner in = new Scanner(System.in);

        System.out.println("Введите длину прямоугольника: ");
        double num1 = in.nextDouble();
        System.out.println("Введите ширину прямоугольника: ");
        double num2 = in.nextDouble();

        rec.perimeterCalculator(num1,num2);
        rec.areaCalculator(num1,num2);

        rec.viewResult();
    }
    public double side1,side2;

    public Rectangle(){}

    //Формула для нахождения площади
    public double areaCalculator(double num1,double num2){
        side1 = (num1 * num2);
        return side1;
    }
}
//Формула для нахождения периметра прямоугольника
public double perimeterCalculator(double num1,double num2){
    side2 = (num1 + num2)*2;
    return side2;
}

public void viewResult(){
    System.out.println("Площадь прямоугольника: "+side1);
    System.out.println("Периметра прямоугольника: "+side2);
}


