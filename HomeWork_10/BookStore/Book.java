package HomeWork_10.BookStore;

class Book implements Printable {
    private String title;

    public Book(String bookTitle) {
        this.title = bookTitle;
    }

    @Override
    public void print() {
        System.out.println("The book title is: " + title);
    }

    public static void printBooks(Printable[] bookPrints) {
        System.out.println("Books:");
        for (Printable printable : bookPrints) {
            if (printable instanceof Book) {
                printable.print();
            }
        }
    }
}
