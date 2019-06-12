package observer;

/**
 * @author yebing
 */
public interface Person {

    /**
     * 添加观察者
     *
     * @param observer
     */
    void addObserver(Observer observer);

    /**
     * 移除观察者
     * @Param observer
     */
    void removeObserver(Observer observer);

    /**
     * 通知观察者
     *
     * @param message
     */
    void notice(String message);
}
