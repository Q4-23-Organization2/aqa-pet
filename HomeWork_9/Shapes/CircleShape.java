package HomeWork_9.Shapes;

import java.util.Objects;
import java.util.Scanner;

public class CircleShape extends Shapes {
    private double circleRadius;

    public CircleShape(String color, double circleRadius) {
        super(color);
        this.circleRadius = circleRadius;
    }

    @Override
    protected double calculatePerimeter() {
        return 2 * Math.PI * circleRadius;
    }

    @Override
    protected double calculateArea() {
        return Math.PI * circleRadius * circleRadius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CircleShape that)) return false;
        if (!super.equals(o)) return false;
        return Double.compare(circleRadius, that.circleRadius) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), circleRadius);
    }

    @Override
    public String toString() {
        return "CircleShape{" +
                "circleRadius=" + circleRadius +
                "} " + super.toString();
    }
}
