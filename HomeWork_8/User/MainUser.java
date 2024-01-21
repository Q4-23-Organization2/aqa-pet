package HomeWork_8.User;

public class MainUser {
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

        firstUser.printUserName();
        firstUser.printUserAge();
        firstUser.printUserPassword();
        firstUser.printMakePurchase();
        firstUser.printTotalAmountOfSpentMoney();

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");

        secondUser.printUserName();
        secondUser.printUserAge();
        secondUser.printUserPassword();
        secondUser.printMakePurchase();
        secondUser.printTotalAmountOfSpentMoney();

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");

        thirdUser.printUserName();
        thirdUser.printUserAge();
        thirdUser.printUserPassword();
        thirdUser.printMakePurchase();
        thirdUser.printTotalAmountOfSpentMoney();

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");

        fourthUser.printUserName();
        fourthUser.printUserAge();
        fourthUser.printUserPassword();
        fourthUser.printMakePurchase();
        fourthUser.printTotalAmountOfSpentMoney();
    }
}
