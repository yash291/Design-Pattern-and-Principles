package Iterator_Design_Pattern;

public class User {

    private String name;
    private String userId;
    
    public String getName() {
        return name;
    }
    
    //Constructor
    public User(String name, String userId) {
        this.name = name;
        this.userId = userId;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }

    
}
