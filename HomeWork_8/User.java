package HomeWork_8;

public class User {
    public String userName;
    public String email;
    public int amountSpentMoney;
    public boolean isActive;
    private int userAge;
    private String  userPassword;

    public  User () {
    }

    public void setUserAge(int age) {
        userAge = age;
    }

    public void setUserPassword(String password) {
        userPassword = password;
    }

    public void printUserName() {
        System.out.println("The user's name is: " + userName);
    }

    public void printUserAge() {
        System.out.println("The user's age is: " + userAge);
    }

    public void printUserPassword() {
        System.out.println("The user's password is: " + userPassword);
    }

    public void makePurchase() {
        System.out.println("Purchase value is: ");
    }

    public void printTotalAmountOfSpentMoney() {
        System.out.println("Purchase value is: ");
    }
}
