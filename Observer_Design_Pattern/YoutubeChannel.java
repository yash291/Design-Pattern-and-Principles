package Observer_Design_Pattern;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel implements Subject{

    List<Observer> subscribers = new ArrayList<>();

    @Override
    public void subscribe(Observer ob) {
        this.subscribers.add(ob);
    }

    @Override
    public void unsubscribe(Observer ob) {
        this.subscribers.remove(ob);
    }

    @Override
    public String toString() {
        return this.subscribers.toString();
    }

    @Override
    public void newVideoUploaded(String title) {

        for(Observer ob: this.subscribers){
            ob.notified(title);
        }
    }

    
    
}
