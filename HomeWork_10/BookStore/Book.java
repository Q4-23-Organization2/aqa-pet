package HomeWork_10.BookStore;

class Book implements Printable {
    private String bookTitle;

    public Book(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    @Override
    public void print() {
        System.out.println("The book title is: " + bookTitle);
    }

    public static void printBooks(Printable[] bookPrints) {
        System.out.println("The list of Books:");
        for (Printable printable : bookPrints) {
            if (printable instanceof Book) {
                printable.print();
            }
        }
    }
}
