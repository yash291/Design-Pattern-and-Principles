package Adapter_Design_Pattern;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Program started");

        //Suppose we dont have Iphone charger.
        AppleCharger appleCharger = new AdapterCharger(new DKCharger());

        Iphone17 iphone17 = new Iphone17(appleCharger);

        iphone17.chargeIphone();
    }
}