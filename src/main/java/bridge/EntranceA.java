package bridge;

/**
 * 桥接模式入口A
 *
 * @author yebing
 */
public class EntranceA extends Origin {

    @Override
    public void entrance() {
        System.out.println("This is EntranceA！");
    }

}
