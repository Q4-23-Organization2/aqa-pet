package HomeWork_9;

public class ProgrammerCalculator extends Calculators {
    public static String programmerCalculation(int binary) {
        return Integer.toString(binary, 2); }
    public static void main(String[] args) {
        System.out.println(Calculators.additionOperation(56.88965, 12.55157));
        System.out.println(Calculators.subtractionOperation(56.88965, 12.55157));
        System.out.println(Calculators.multiplicationOperation(56.88965, 12.55157));
        System.out.println(Calculators.divisionOperation(56.88965, 12.55157));
        System.out.println(programmerCalculation(8));
    }
}
