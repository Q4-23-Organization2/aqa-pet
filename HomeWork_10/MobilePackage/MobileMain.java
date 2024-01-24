package HomeWork_10.MobilePackage;

public class MobileMain {
    public static void main(String[] args) {
        MobilePhone myMobilePhone = new Model("NokiRolla", "SamsHonor");
        myMobilePhone.makeCall("+380982345678");
        myMobilePhone.sendSMS("+380982345678", "Thank you for teaching us!");
    }
}
