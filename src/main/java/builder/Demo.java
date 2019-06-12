package builder;

/**
 * @author yebing
 */
public class Demo {
    public static void main(String[] args) {
        PersonDirector man = new PersonDirector();
        System.out.println(man.director().toString());
    }
}
