package HomeWork_10.MobilePackage;

interface Mobile {
    static final String RECHARGE = "Don't forget to charge your mobile phone periodically!";
    void makeCall(int phoneNumber);
    void sendSMS(int phoneNumber, String textMessage);
}
