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
        if (age < 18) {
            System.out.println("The " + userName + " age is less than the minimum allowed!");
        } else if (age >= 90) {
            System.out.println("The " + userName + " age is greater than the maximum allowed!");
        } else {
            userAge = age;
        }
    }

    public void setUserPassword(String password) {
        if (password.length() < 8) {
            System.out.println("The password length of user " + userName + " is less than the minimum allowed value!");
        } else if (password.length() >= 25) {
            System.out.println("The password length of user " + userName + " exceeds the maximum allowed value!");
        }
        else {
            userPassword = password;
        }
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
