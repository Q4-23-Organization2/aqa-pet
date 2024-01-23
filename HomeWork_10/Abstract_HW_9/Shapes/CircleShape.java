package HomeWork_10.Abstract_HW_9.Shapes;

import java.util.Objects;

class Circle extends Shapes {
    private final double circleRadius;

    public Circle(String color, double radius) {
        super(color);
        this.circleRadius = radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * circleRadius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * circleRadius * circleRadius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circle circle)) return false;
        if (!super.equals(o)) return false;
        return Double.compare(circleRadius, circle.circleRadius) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), circleRadius);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "circleRadius=" + circleRadius +
                "} " + super.toString();
    }
}
