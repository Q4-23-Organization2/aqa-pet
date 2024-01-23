package HomeWork_9.Shapes;

import java.util.Objects;

public class TriangleShape extends Shapes {
    private double sideA;
    private double sideB;
    private double sideC;

    public TriangleShape(String color, double sideA, double sideB, double sideC) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    protected double calculatePerimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    protected double calculateArea() {
        //Calculate the area of the triangle using the formula
        double halfPerimeter = (sideA + sideB + sideC) / 2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - sideA) * (halfPerimeter - sideB) * (halfPerimeter - sideC));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TriangleShape that)) return false;
        if (!super.equals(o)) return false;
        return Double.compare(sideA, that.sideA) == 0 && Double.compare(sideB, that.sideB) == 0 && Double.compare(sideC, that.sideC) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), sideA, sideB, sideC);
    }

    @Override
    public String toString() {
        return "TriangleShape{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                ", sideC=" + sideC +
                "} " + super.toString();
    }
}

