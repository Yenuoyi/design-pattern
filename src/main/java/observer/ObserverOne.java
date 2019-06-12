package observer;

/**
 * 观察者one
 *
 * @author yebing
 */
public class ObserverOne implements Observer {
    private String bname = "观察者one";

    @Override
    public void update(String message, String name) {
        System.out.println(bname + ":" + "收到" + name + "消息，内容：" + message);
    }
}
