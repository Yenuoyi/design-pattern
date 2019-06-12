package duck;

/**
 * 定义一个鸭子类，拥有鸭子所有的公共属性，这个可以是玩具鸭，真鸭，水鸭等等
 * @author yebing
 */
public class Duck {
    protected FlyDuckBehavior flyDuck;
    protected ShoutDuckBehavior shoutDuck;
    public void head(){
        System.out.println("This duck have head!");
    }

    public void foot(){
        System.out.println("This duck have foot");
    }

    public void wing(){
        System.out.println("This duck have wing");
    }

    public void fly(){
        flyDuck.fly();
    }

    public void shout(){
        shoutDuck.shout();
    }

    public FlyDuckBehavior getFlyDuck() {
        return flyDuck;
    }

    public void setFlyDuck(FlyDuckBehavior flyDuck) {
        this.flyDuck = flyDuck;
    }

    public ShoutDuckBehavior getShoutDuck() {
        return shoutDuck;
    }

    public void setShoutDuck(ShoutDuckBehavior shoutDuck) {
        this.shoutDuck = shoutDuck;
    }
}
