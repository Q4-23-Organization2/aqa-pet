package HomeWork_9.Shapes;

import java.util.Objects;

public class RectangleShape extends Shapes {
    private double rectangleLength;
    private double rectangleWidth;

    public RectangleShape(String color, double rectangleLength, double rectangleWidth) {
        super(color);
        this.rectangleLength = rectangleLength;
        this.rectangleWidth = rectangleWidth;
    }

    @Override
    protected double calculatePerimeter() {
        return 2 * (rectangleLength + rectangleWidth);
    }

    @Override
    protected double calculateArea() {
        return rectangleLength * rectangleWidth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RectangleShape that)) return false;
        if (!super.equals(o)) return false;
        return Double.compare(rectangleLength, that.rectangleLength) == 0 && Double.compare(rectangleWidth, that.rectangleWidth) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), rectangleLength, rectangleWidth);
    }

    @Override
    public String toString() {
        return "RectangleShape{" +
                "rectangleLength=" + rectangleLength +
                ", rectangleWidth=" + rectangleWidth +
                "} " + super.toString();
    }
}

