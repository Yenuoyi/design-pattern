package facade;

/**
 * @author yebing
 */
public class Client {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.Chat();
        facade.run();
    }
}
