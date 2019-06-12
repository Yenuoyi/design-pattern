package abstractfactory;

/**
 * @author yebing
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("This is rectangle!");
    }
}
