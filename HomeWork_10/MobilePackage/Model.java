package HomeWork_10.MobilePackage;

public class Model extends MobilePhone{
    private final String phoneModel;

    Model(String mobileBrand, String phoneModel) {
        super(mobileBrand);
        this.phoneModel = phoneModel;
    }

    @Override
    public void makeScreenShot() {
        System.out.println(phoneModel + " is making a screenshot in application.");
    }

    public void phoneCharge () {
        System.out.println(phoneModel + " is charging now.");
    }
}
