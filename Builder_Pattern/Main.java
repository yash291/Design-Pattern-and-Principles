package Builder_Pattern;

public class Main {
    
    public static void main(String[] args) {
        
        // we can also make static methods inside user builder and then we do not need to use new keyword 
        // while creating the objects

        User user = new User.UserBuilder().
        setEmailId("abc@gmail.com").
        setUserId("abc@123").
        setUserName("xyz").build();

        System.out.println(user);

        //Here we no need to remember order and sequence.
        
    }
}
