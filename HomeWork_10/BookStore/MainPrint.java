package HomeWork_10.BookStore;

public class MainPrint {
    public static void main(String[] args) {
        Printable[] prints = new Printable[10];
        prints[0] = new Book("Java Programming");
        prints[1] = new Magazine("Science Today");
        prints[2] = new Book("The Art of Programming");
        prints[3] = new Magazine("Nature");
        prints[4] = new Book("Java Programming");
        prints[5] = new Magazine("Science Today");
        prints[6] = new Book("The Art of Programming");
        prints[7] = new Magazine("Nature");
        prints[8] = new Book("The Art of Programming");
        prints[9] = new Magazine("Nature");

        Magazine.printMagazines(prints);
        Book.printBooks(prints);
    }
}
