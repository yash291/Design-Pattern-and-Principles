package Iterator_Design_Pattern;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        
        UserManagement management = new UserManagement();
        management.addUser(new User("Yash", "12"));
        management.addUser(new User("Yash", "13"));
        management.addUser(new User("Yash", "14"));
        management.addUser(new User("Yash", "15"));

        MyIterator iterator = management.getIterator();
        while (iterator.hasNext()) {
            User user = (User) iterator.next();
            System.out.println("UserId: " + user.getUserId());
        }
    }
}