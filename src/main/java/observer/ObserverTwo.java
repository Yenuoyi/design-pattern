package observer;

/**
 * @author yebing
 */
public class ObserverTwo implements Observer {
    private String bname = "观察者Two";

    @Override
    public void update(String message, String name) {
        System.out.println(bname + ":" + "收到" + name + "消息，内容：" + message);
    }

}
