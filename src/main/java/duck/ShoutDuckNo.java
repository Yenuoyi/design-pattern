package duck;

/**
 * 不会叫的鸭子
 * @author yebing
 */
public class ShoutDuckNo implements ShoutDuckBehavior {
    public void shout() {
        System.out.println("This is a no shout duck!");
    }
}
