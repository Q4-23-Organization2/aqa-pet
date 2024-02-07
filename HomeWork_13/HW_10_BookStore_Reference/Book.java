package HomeWork_13.HW_10_BookStore_Reference;

// Класс Book, реализующий интерфейс Printable
class Book implements Printable {
    private final String bookTitle;

    // Конструктор класса Book
    public Book(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    // Реализация метода print() для класса Book
    @Override
    public void print() {
        System.out.println("The book title is: " + bookTitle);
    }
}
