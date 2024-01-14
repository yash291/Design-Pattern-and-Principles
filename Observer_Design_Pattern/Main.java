package Observer_Design_Pattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class Main {
    
    public static void main(String[] args) throws NumberFormatException, IOException {
        
        YoutubeChannel channel =  new YoutubeChannel();
        Subscriber aman = new Subscriber("Aman");
        Subscriber raman = new Subscriber("Raman");

        channel.subscribe(raman);
        channel.subscribe(aman);

        channel.newVideoUploaded("Learn Design Pattern");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {

            System.out.println("Press 1 to upload video");
            System.out.println("Press 2 to create new Subscriber");
            System.out.println("Press 3 to Unsubscribe");
            System.out.println("Press 4 to exit");

            int c = Integer.parseInt(br.readLine());
            if(c == 1){
                //new video upload code
                System.out.println("Enter video title");
                String videoTitle = br.readLine();
                channel.newVideoUploaded(videoTitle);
            }else if(c == 2){
                //create new subscriber
                System.out.println("Enter name of subscriber");
                String subsName = br.readLine();
                Subscriber subscriber3 = new Subscriber(subsName);
                channel.subscribe(subscriber3);

            } // Unsubscribe method incomplete
            else if(c == 3){
                System.out.println("Enter name of subscriber");
                String subsName1 = br.readLine();
                int listSize = channel.subscribers.size();
                for(int i = 0; i < listSize; i++){
                    // if()
                    System.out.println(channel.subscribers.get(i).toString());
                }
                //channel.unsubscribe(unSubscriber);
                System.out.println("Very sad to see you go !!!. You have successfully unsubscribed");

            }else if(c == 4){
                //exit
                System.out.println("Thank you for using App");
                break;
            }else{
                //exit worng input
                System.out.println("Wrong input");
            }
        }
    }
}
