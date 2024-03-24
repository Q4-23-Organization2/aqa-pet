package HomeWork_13.HW_10_BookStore_Reference;

import java.util.Arrays;

@FunctionalInterface
public interface Printable {
    // Метод print, который должны реализовать классы, реализующие интерфейс Printable
    void print();

    // Дефолтный метод для печати массива объектов типа Printable (для книг)
    default void printArrayBooks(Printable[] prints) {
        System.out.println("Printing Books:");
        Arrays.stream(prints)
                .filter(printable -> printable instanceof Book)
                .forEach(Printable::print);
    }

    // Дефолтный метод для печати массива объектов типа Printable (для журналов)
    default void printArrayMagazines(Printable[] prints) {
        System.out.println("Printing Magazines:");
        Arrays.stream(prints)
                .filter(printable -> printable instanceof Magazine)
                .forEach(Printable::print);
    }
}
