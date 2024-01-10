package Abstract_Factory_Design_Pattern;

public class AndoridDeveloperFactory extends EmploeeAbstractFactory{

    @Override
    public Employee createEmployee() {
        return new AndoridDeveloper();
    }
    
}
