package HomeWork_13.HW_10_BookStore_Reference;

// Основной класс MainPrint
public class MainPrint {
    public static void main(String[] args) {
        // Создание массива объектов типа Printable
        Printable[] prints = new Printable[10];
        prints[0] = new Book("First book");
        prints[1] = new Magazine("First magazine");
        prints[2] = new Book("Second book");
        prints[3] = new Magazine("Second magazine");
        prints[4] = new Book("Third book");
        prints[5] = new Magazine("Third magazine");
        prints[6] = new Book("Fourth book");
        prints[7] = new Magazine("Fourth magazine");
        prints[8] = new Book("Fifth book");
        prints[9] = new Magazine("Fifth magazine");

        // Вызов метода printArray для печати всех объектов в массиве prints
        printBooks(prints);
        printMagazines(prints);
    }

    // Метод для печати всех книг
    public static void printBooks(Printable[] prints) {
        System.out.println("Printing Books:");
        for (Printable printable : prints) {
            if (printable instanceof Book) {
                printable.print();
            }
        }
    }

    // Метод для печати всех журналов
    public static void printMagazines(Printable[] prints) {
        System.out.println("Printing Magazines:");
        for (Printable printable : prints) {
            if (printable instanceof Magazine) {
                printable.print();
            }
        }
    }
}
