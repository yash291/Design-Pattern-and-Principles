package Abstract_Factory_Design_Pattern;

public class EmployeeFactory {

    //get Employee

    public static Employee getEmployee(EmploeeAbstractFactory abstractFactory){
        return abstractFactory.createEmployee();
    }
    
}
