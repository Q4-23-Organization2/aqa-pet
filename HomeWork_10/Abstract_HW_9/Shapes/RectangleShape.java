package HomeWork_10.Abstract_HW_9.Shapes;

import java.util.Objects;

class RectangleShape extends Shapes {
    private final double length;
    private final double width;

    public RectangleShape(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RectangleShape that)) return false;
        if (!super.equals(o)) return false;
        return Double.compare(length, that.length) == 0 && Double.compare(width, that.width) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), length, width);
    }

    @Override
    public String toString() {
        return "RectangleShape{" +
                "length=" + length +
                ", width=" + width +
                ", color='" + color + '\'' +
                "} " + super.toString();
    }
}
