package HomeWork_10.Abstract_HW_9.Shapes;

import java.util.Objects;

abstract class Shapes {
    protected String color;

    public Shapes(String color) {
        this.color = color;
    }

    public abstract double calculatePerimeter();

    public abstract double calculateArea();

    public void paint () {
        System.out.println("Color of this shape is: " + color);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Shapes shapes)) return false;
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

