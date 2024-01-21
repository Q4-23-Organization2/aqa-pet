package HomeWork_8.Calculator;

import java.util.Scanner;
public class Calculator {
    public static double a;
    public static double b;

    public static void additionOperation () {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input your first number: ");
        double yourFirstNum;
        yourFirstNum = scan.nextDouble();
        a = yourFirstNum;
        System.out.println("Input your second number: ");
        double yourSecondNum;
        yourSecondNum = scan.nextDouble();
        b = yourSecondNum;
        System.out.println("The sum of the addition is: " + (a + b));
    }
    public static void subtractionOperation () {
        System.out.println("The sum of the addition is: " + (a - b));
    }
    public static void multiplicationOperation () {
        System.out.println("The sum of the addition is: " + (a * b));
    }
    public static void divisionOperation () {
        System.out.println("The sum of the addition is: " + (a / b));
    }
}
