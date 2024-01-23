package HomeWork_10.Abstract_HW_9.Shapes;

import java.util.Objects;

class TriangleShape extends Shapes {
    private final double sideA;
    private final double sideB;
    private final double sideC;

    public TriangleShape(String color, double sideA, double sideB, double sideC) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double calculatePerimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    public double calculateArea() {
        double s = (sideA + sideB + sideC) / 2;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
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
                ", color='" + color + '\'' +
                "} " + super.toString();
    }
}
