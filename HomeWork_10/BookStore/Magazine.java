package HomeWork_10.BookStore;

class Magazine implements Printable {
    private String magazineTitle;

    public Magazine(String magazineTitle) {
        this.magazineTitle = magazineTitle;
    }

    @Override
    public void print() {
        System.out.println("The magazine title is: " + magazineTitle);
    }

    public static void printMagazines(Printable[] magazinePrints) {
        System.out.println("The list of Magazines:");
        for (Printable printable : magazinePrints) {
            if (printable instanceof Magazine) {
                printable.print();
            }
        }
    }
}
