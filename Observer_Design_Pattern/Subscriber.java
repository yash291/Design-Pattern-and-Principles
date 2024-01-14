package Observer_Design_Pattern;

public class Subscriber implements Observer{

    String name;

    Subscriber(String name){
        this.name = name;
    }

    @Override
    public void notified(String title) {
        System.out.println("Hello " + this.name + " new video uploaded : " +  title);
    }

    @Override
    public String toString() {
        return this.name;
    }
    
}
