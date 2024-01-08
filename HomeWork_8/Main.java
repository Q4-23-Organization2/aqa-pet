package HomeWork_8;

public class Main {
    public static void main(String[] args) {
        User firstUser = new User();
        firstUser.setUserName("Stanislav");

        User secondUser = new User();
        secondUser.setUserName("Yulia");

        User thirdUser = new User();
        thirdUser.setUserName("Igor");

        User fourthUser = new User();
        fourthUser.setUserName("Oleg");

        firstUser.printUserName();
        secondUser.printUserName();
        thirdUser.printUserName();
        fourthUser.printUserName();
    }
}
