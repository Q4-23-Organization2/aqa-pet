package HomeWork_8;

public class User {
    private String userName;
    public String email;
    public int amountSpentMoney;
    public boolean isActive;
    private int age;
    private int password;

    public  User () {
    }

    public void setUserName(String name) {
        userName = name;
    }

    public void printUserName() {
        System.out.println("The user's name is: " + userName);
    }

    public void makePurchase() {
        System.out.println("Purchase value is: ");
    }

    public void printTotalAmountOfSpentMoney() {
        System.out.println("Purchase value is: ");
    }
}
