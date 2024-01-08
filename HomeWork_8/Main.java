package HomeWork_8;

public class Main {
    public static void main(String[] args) {
        User firstUser = new User();
        firstUser.userName = "Stanislav";
        firstUser.setUserAge(42);
        firstUser.setUserPassword("1qaz!!QQAAZZ");

        User secondUser = new User();
        secondUser.userName = "Yulia";
        secondUser.setUserAge(41);
        secondUser.setUserPassword("2wsx@@WWSSXX");

        User thirdUser = new User();
        thirdUser.userName = "Igor";
        thirdUser.setUserAge(13);
        thirdUser.setUserPassword("3edc##EEDDCC");

        User fourthUser = new User();
        fourthUser.userName = "Oleg";
        fourthUser.setUserAge(8);
        fourthUser.setUserPassword("4rfv$$RRFFVV");

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");

        firstUser.printUserName();
        firstUser.printUserAge();
        firstUser.printUserPassword();

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");

        secondUser.printUserName();
        secondUser.printUserAge();
        secondUser.printUserPassword();

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");

        thirdUser.printUserName();
        thirdUser.printUserAge();
        thirdUser.printUserPassword();

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");

        fourthUser.printUserName();
        fourthUser.printUserAge();
        fourthUser.printUserPassword();
    }
}
