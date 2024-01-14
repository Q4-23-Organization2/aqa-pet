package HomeWork_9;

public class ScientificCalculator extends Calculators {
    private String scientificCalculation;
    public static double scientificCalculation(double squareRoot) {
        return Math.sqrt(squareRoot); }
    public static void main(String[] args) {
        System.out.println(Calculators.additionOperation(56.88965, 12.55157));
        System.out.println(Calculators.subtractionOperation(56.88965, 12.55157));
        System.out.println(Calculators.multiplicationOperation(56.88965, 12.55157));
        System.out.println(Calculators.divisionOperation(56.88965, 12.55157));
        System.out.println(scientificCalculation(25.000));
    }
}
