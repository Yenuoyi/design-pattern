package duck;

/**
 * 会叫的鸭子
 * @author yebing
 */
public class ShoutDuckYes implements ShoutDuckBehavior {
    public void shout() {
        System.out.println("This is can shout duck!");
    }
}
