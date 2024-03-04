package HomeWork_13.HW_10_BookStore_Reference;

@FunctionalInterface
public interface Printable {
    // Метод print, который должны реализовать классы, реализующие интерфейс Printable
    void print();

    // Дефолтный метод для печати массива объектов типа Printable (для книг)
    default void printArrayBooks(Printable[] prints) {
        System.out.println("Printing Books:");
        // Итерация по массиву и вызов метода print() для каждой книги
        for (Printable printable : prints) {
            if (printable instanceof Book) {
                printable.print();
            }
        }
    }

    // Дефолтный метод для печати массива объектов типа Printable (для журналов)
    default void printArrayMagazines(Printable[] prints) {
        System.out.println("Printing Magazines:");
        // Итерация по массиву и вызов метода print() для каждого журнала
        for (Printable printable : prints) {
            if (printable instanceof Magazine) {
                printable.print();
            }
        }
    }
}
