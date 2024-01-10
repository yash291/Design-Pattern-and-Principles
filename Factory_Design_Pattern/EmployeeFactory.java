package Factory_Design_Pattern;

public class EmployeeFactory {
    
    //get the Employee
    public static Employee getEmployee(String empType){
        if(empType.trim().equalsIgnoreCase("ANDROID DEVELOPER")){
            return new AndroidDeveloper();
        }else if(empType.trim().equalsIgnoreCase("WEB DEVELOPER")){
            return new WebDev();
        }else{
            return null;
        }

    }
}
