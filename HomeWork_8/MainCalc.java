package HomeWork_8;
import static HomeWork_8.Calculator.additionOperation;
import static HomeWork_8.Calculator.subtractionOperation;
public class MainCalc {
    public static void main(String[] args) {
/*        Calculator operand = new Calculator(45.893, 23.127);*/
        additionOperation();
        subtractionOperation();
        Calculator.multiplicationOperation();
        Calculator.divisionOperation();
    }
}
