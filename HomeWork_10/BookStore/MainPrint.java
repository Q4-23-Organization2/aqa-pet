package HomeWork_10.BookStore;

public class MainPrint {
    public static void main(String[] args) {
        Printable[] printables = new Printable[4];
        printables[0] = new Book("Java Programming");
        printables[1] = new Magazine("Science Today");
        printables[2] = new Book("The Art of Programming");
        printables[3] = new Magazine("Nature");

        // Вызов метода print() для каждого объекта в массиве
        for (Printable printable : printables) {
            printable.print();
        }

        // Вызов статического метода для вывода названий только журналов
        Magazine.printMagazines(printables);
    }
}
