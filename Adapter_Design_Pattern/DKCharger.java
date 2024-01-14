package Adapter_Design_Pattern;

public class DKCharger implements AndroidCharger{

    @Override
    public void chargeAndroidPhone() {
        System.out.println("Your Android Phone is charging");
    }
    
    
}
