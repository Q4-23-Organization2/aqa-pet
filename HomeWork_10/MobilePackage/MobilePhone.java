package HomeWork_10.MobilePackage;

abstract class MobilePhone implements Mobile {
    private final String mobileBrand;

    MobilePhone(String mobileBrand) {
        this.mobileBrand = mobileBrand;
    }
    public String getMobileBrand () {

        return getMobileBrand();
    }

    public abstract void makeScreenShot();

    @Override
    public void makeCall(String phoneNumber) {
        System.out.println(mobileBrand + " calls the number: " + phoneNumber);
    }

    @Override
    public void sendSMS(String phoneNumber, String textMessage) {
        System.out.println(mobileBrand + " sending SMS to: " + phoneNumber + " . Message text is: " + textMessage);
    }
}
