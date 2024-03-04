package HomeWork_13.HW_10_BookStore_Reference;

// Класс Magazine, реализующий интерфейс Printable
class Magazine implements Printable {
    private final String magazineTitle;

    // Конструктор класса Magazine
    public Magazine(String magazineTitle) {
        this.magazineTitle = magazineTitle;
    }

    // Метод print() для класса Magazine
    @Override
    public void print() {
        System.out.println("The magazine title is: " + magazineTitle);
    }
}
