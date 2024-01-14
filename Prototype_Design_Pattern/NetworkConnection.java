package Prototype_Design_Pattern;

import java.util.ArrayList;
import java.util.List;

public class NetworkConnection implements Cloneable{
    
    private String IP;
    private String importantData;
    private List<String> domains = new ArrayList<>();

    public NetworkConnection(){

    }

    public List<String> getDomains() {
        return domains;
    }

    public void setDomains(List<String> domains) {
        this.domains = domains;
    }

    public String getImportantData() {
        return importantData;
    }

    public void setImportantData(String importantData) {
        this.importantData = importantData;
    }

    public String getIP() {
        return IP;
    }

    public void setIP(String iP) {
        IP = iP;
    }
    
    public void loadVeryImportantData() throws InterruptedException{
        this.importantData = "Very very important data";
        domains.add("www.google.com");
        domains.add("yahoo.com");
        domains.add("bing.com");
        domains.add("lcwd.com");

        //it will take 5 minutes : suppose
        Thread.sleep(5000);
    }

    @Override
    public String toString() {
        return this.IP + " : " + this.importantData + " : " + this.domains;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        //Logic for cloning
        NetworkConnection networkConnection = new NetworkConnection();
        networkConnection.setIP(this.getIP());
        networkConnection.setImportantData(this.importantData);
        
        for(String d: this.getDomains()){
            networkConnection.getDomains().add(d);
        }
        return networkConnection;
    }
    
}
