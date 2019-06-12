package duck;

/**
 * @author yebing
 */
public class DuckDemo extends Duck{
    public DuckDemo(){
        flyDuck = new FlyDuckYes();
        shoutDuck = new ShoutDuckYes();
    }

    public void action(){
        head();
        foot();
        wing();
        fly();
        shout();
    }

    public static void main(String[] args) {
        DuckDemo duckDemo = new DuckDemo();
        duckDemo.action();
    }
}
