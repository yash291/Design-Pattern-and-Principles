package Abstract_Factory_Design_Pattern;

public class WebDeveloperFactory extends EmploeeAbstractFactory{

    @Override
    public Employee createEmployee() {
        return new WebDeveloper();
    }
    
}
