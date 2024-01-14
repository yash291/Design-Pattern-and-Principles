package Prototype_Design_Pattern;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Creating object using prototype design");

        NetworkConnection connection = new NetworkConnection();
        connection.setIP("192.168.4.4");
        connection.loadVeryImportantData();

        System.out.println(connection);

        //We want new object of clone
        
        try{
            NetworkConnection connection2 = (NetworkConnection)connection.clone();
            NetworkConnection connection3 = (NetworkConnection)connection.clone();
            
            connection.getDomains().remove(0);

            System.out.println(connection);
            
            System.out.println(connection2);
            System.out.println(connection3);

        }catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
        
    }
}