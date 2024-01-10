package Abstract_Factory_Design_Pattern;

public class Main {
    public static void main(String[] args) {
        
        // get Andorid Developer

        Employee e1 = EmployeeFactory.getEmployee(new AndoridDeveloperFactory());
        e1.name();

        //get Web Developer

        Employee e2 = EmployeeFactory.getEmployee(new WebDeveloperFactory());
        e2.salary();
    }
}
