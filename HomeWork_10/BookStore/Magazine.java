package HomeWork_10.BookStore;

class Magazine implements Printable {
    private String title;

    public Magazine(String magazineTitle) {
        this.title = magazineTitle;
    }

    @Override
    public void print() {
        System.out.println("The magazine title is: " + title);
    }

    public static void printMagazines(Printable[] magazinePrints) {
        System.out.println("Magazines:");
        for (Printable printable : magazinePrints) {
            if (printable instanceof Magazine) {
                printable.print();
            }
        }
    }
}
