package HomeWork_8;

public class Main {
    public static void main(String[] args) {
        User firstUser = new User();
        firstUser.userName = "Stanislav";

        User secondUser = new User();
        secondUser.userName = "Yulia";

        User thirdUser = new User();
        thirdUser.userName = "Igor";

        User fourthUser = new User();
        fourthUser.userName = "Oleg";

        firstUser.printUserName();
        secondUser.printUserName();
        thirdUser.printUserName();
        fourthUser.printUserName();
    }
}
