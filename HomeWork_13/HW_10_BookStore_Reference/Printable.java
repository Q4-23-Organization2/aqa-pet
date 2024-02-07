package HomeWork_13.HW_10_BookStore_Reference;

public interface Printable {
    // Объявление метода print, который должны реализовать классы, реализующие интерфейс Printable
    void print();

    // Дефолтный метод для печати массива объектов типа Printable
    default void printArrayPrintable(Printable[] prints) {
        // Итерация по массиву и вызов метода print() для каждого элемента
        for (Printable printable : prints) {
            printable.print();
        }
    }
}
