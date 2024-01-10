package Abstract_Factory_Design_Pattern;

public class WebDeveloper implements Employee{
    
    public int salary(){
        return 40000;
    }

    public String name(){
        System.out.println("I am web developer");
        return "WEB DEVELOPER";
    }
}
