package HomeWork_8;

public class Main {
    public static void main(String[] args) {
        User firstUser = new User("Stanislav");
        firstUser.setUserAge(90);
        firstUser.setUserPassword("1qaz!!QQAAZZ");
        firstUser.purchasePrice = 2.33;

        User secondUser = new User("Yulia", 41);
        secondUser.setUserPassword("2X");
        secondUser.purchasePrice = 12.7;

        User thirdUser = new User("Igor", 13, "3edc##EEDDCC");
        thirdUser.purchasePrice = 6.2345;

        User fourthUser = new User();
        fourthUser.userName = "Oleg";
        fourthUser.setUserAge(8);
        fourthUser.setUserPassword("4rfv$$RRFFVV4rfv$$RRFFVV4rfv$$RRFFVV");
        fourthUser.purchasePrice = 5.654;

        User totalSpent = new User();
        totalSpent.makePurchase();
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");

        firstUser.printUserName();
        firstUser.printUserAge();
        firstUser.printUserPassword();
        firstUser.printMakePurchase();

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");

        secondUser.printUserName();
        secondUser.printUserAge();
        secondUser.printUserPassword();
        secondUser.printMakePurchase();

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");

        thirdUser.printUserName();
        thirdUser.printUserAge();
        thirdUser.printUserPassword();
        thirdUser.printMakePurchase();

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");

        fourthUser.printUserName();
        fourthUser.printUserAge();
        fourthUser.printUserPassword();
        fourthUser.printMakePurchase();

        totalSpent.printTotalAmountOfSpentMoney();
    }
}
