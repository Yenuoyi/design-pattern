package duck;

/**
 * 这是一个不会飞的鸭子
 * @author yebing
 */
public class FlyDuckNo implements FlyDuckBehavior {
    public void fly() {
        System.out.println("This is No fly duck!");
    }
}
