package HomeWork_8.User;

import java.util.Scanner;
public class User {
    public String userName;
    public String email;
    public double purchasePrice = 0;
    public double amountSpentMoney = 0;
    public boolean isActive;
    private int age;
    private String  password;

    public  User () {
    }

    public  User (String userName) {
        this.userName = userName;
    }

    public  User (String userName, int age) {
        this(userName);
        setUserAge(age);
    }

    public  User (String userName, int age, String password) {
        this(userName);
        setUserAge(age);
        setUserPassword(password);
    }


    public void setUserAge(int newUserAge) {
        if (newUserAge < 18) {
            System.out.println("The " + userName + " age is less than the minimum allowed!");
        } else if (newUserAge >= 90) {
            System.out.println("The " + userName + " age is greater than the maximum allowed!");
        } else {
            age = newUserAge;
        }
    }

    public void setUserPassword(String newPassword) {
        if (newPassword.length() < 8) {
            System.out.println("The password length of user " + userName + " is less than the minimum allowed value!");
        } else if (newPassword.length() >= 25) {
            System.out.println("The password length of user " + userName + " exceeds the maximum allowed value!");
        }
        else {
            password = newPassword;
        }
    }

    public void printUserName() {
        System.out.println("The user's name is: " + userName);
    }

    public void printUserAge() {
        System.out.println("The user's age is: " + age);
    }

    public void printUserPassword() {
        System.out.println("The user's password is: " + password);
    }

    public void printMakePurchase() {
        System.out.println("Purchase price is: " + makePurchase(purchasePrice));
    }

    public void printTotalAmountOfSpentMoney() {
        makePurchase(purchasePrice);
        System.out.println("Total Amount Of Spent Money is: " + makePurchase(purchasePrice));
    }

    public double makePurchase(double purchasePrice) {
        Scanner inputCount = new Scanner(System.in);
        System.out.println("Enter the number of purchases: ");
        int purchaseCount = inputCount.nextInt();
            double[] purchase = new double[purchaseCount];
            System.out.println("Enter purchase amounts: ");
            for (int i = 0; i < purchaseCount; i++) {
                purchase[i] = inputCount.nextDouble();
                System.out.println("Purchase price is: " + purchase[i]);
                purchasePrice += purchase[i];
            }
        System.out.println("Total Purchase price is: " + purchasePrice);
        return purchasePrice;
    }
}
