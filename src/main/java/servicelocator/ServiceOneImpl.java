package servicelocator;

public class ServiceOneImpl implements Service {
    @Override
    public String getName() {
        return "ServiceOneImpl";
    }

    @Override
    public void execute() {
        System.out.println(this.getName());
    }
}
