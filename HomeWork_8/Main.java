package HomeWork_8;

public class Main {
    public static void main(String[] args) {
        User firstUser = new User("Stanislav");
        firstUser.setUserAge(90);
        firstUser.setUserPassword("1qaz!!QQAAZZ");

        User secondUser = new User("Yulia", 41);
        secondUser.setUserPassword("2X");

        User thirdUser = new User("Igor", 13, "3edc##EEDDCC");

        User fourthUser = new User();
        fourthUser.userName = "Oleg";
        fourthUser.setUserAge(8);
        fourthUser.setUserPassword("4rfv$$RRFFVV4rfv$$RRFFVV4rfv$$RRFFVV");

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
