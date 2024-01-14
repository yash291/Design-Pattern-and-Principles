package Observer_Design_Pattern;

interface Observer {
    
    void notified(String title);

    @Override
    String toString();
}
