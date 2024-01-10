package Abstract_Factory_Design_Pattern;

public class AndoridDeveloper implements Employee{

    public int salary(){
        return 50000;
    }

    public String name(){
        System.out.println("I am android developer");
        return "ANDROID DEVELOPER";
    }
}
