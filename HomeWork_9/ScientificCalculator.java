package HomeWork_9;

public class ScientificCalculator extends Calculators {
    private static double scientificCalculation() {
        return Math.sqrt(25.0); } //Извлечение квадратного корня.
    public static void main(String[] args) {
        System.out.println(additionOperation(56.88965, 12.55157));
        System.out.println(subtractionOperation(56.88965, 12.55157));
        System.out.println(multiplicationOperation(56.88965, 12.55157));
        System.out.println(divisionOperation(56.88965, 12.55157));
        System.out.println(scientificCalculation());
    }
}
