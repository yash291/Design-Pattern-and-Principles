package Factory_Design_Pattern;

public class Main {
    
    public static void main(String[] args) {

        Employee employee  = EmployeeFactory.getEmployee("ANDROID DEVELOPER");
        int sal = employee.salary();    
        System.out.println(sal);
    }

}
