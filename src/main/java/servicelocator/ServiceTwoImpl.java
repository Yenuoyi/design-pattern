package servicelocator;

public class ServiceTwoImpl implements Service {
    @Override
    public String getName() {
        return "ServiceTwoImpl";
    }

    @Override
    public void execute() {
        System.out.println(this.getName());
    }
}
