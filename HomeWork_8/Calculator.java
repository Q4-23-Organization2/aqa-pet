package HomeWork_8;

public class Calculator {
    public static double a;
    public static double b;

    public Calculator (double a, double b) {
        Calculator.a = a;
        Calculator.b = b;
    }

    public static void additionOperation () {
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
