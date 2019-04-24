package decorator;

/**
 * @author yebing
 */
public class Employee implements Person {

    @Override
    public void doCoding() {
        System.out.println("Programmer doCoding");
    }
}
