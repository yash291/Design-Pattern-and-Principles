package Adapter_Design_Pattern;

public class Iphone17 {
    
    private AppleCharger appleCharger;

    public Iphone17(AppleCharger appleCharger){
        this.appleCharger = appleCharger;
    }

    public void chargeIphone(){

        appleCharger.chargePhone();
    }
}
