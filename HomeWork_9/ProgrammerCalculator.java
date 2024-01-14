package HomeWork_9;

public class ProgrammerCalculator extends Calculators {
    public static String programmerCalculation(int binary) {
        return Integer.toString(binary, 2); } //Перевод в двоичную симтему исчисления.
    public static void main(String[] args) {
        System.out.println(additionOperation(56.88965, 12.55157));
        System.out.println(subtractionOperation(56.88965, 12.55157));
        System.out.println(multiplicationOperation(56.88965, 12.55157));
        System.out.println(divisionOperation(56.88965, 12.55157));
        System.out.println(programmerCalculation(1024));
    }
}
