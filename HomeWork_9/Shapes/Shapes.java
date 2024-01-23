package HomeWork_9.Shapes;

import java.util.Objects;

public class Shapes {
    private String color;

    public Shapes(String color) {
        this.color = color;
    }

    protected double calculateArea() {
        return 0.0;
    }
    protected double calculatePerimeter() {
        return 0.0;
    }

    protected void paint () {
        System.out.println("Color of the shape is: " + color);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shapes shapes = (Shapes) o;
        return Objects.equals(color, shapes.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color);
    }

    @Override
    public String toString() {
        return "Shapes{" +
                "color='" + color + '\'' +
                '}';
    }
}

