package observer;

/**
 * 观察者模式
 * @author yebing
 */
public class ObserverDemo {
    public static void main(String[] args) {
        Person personOne = new PersonOne();
        Person personTwo = new PersonTwo();

        Observer o1 = new ObserverOne();
        Observer o2 = new ObserverTwo();
        Observer o3 = new ObserverThree();

        personOne.addObserver(o1);
        personOne.addObserver(o2);
        personTwo.addObserver(o1);
        personTwo.addObserver(o3);

        String message1 = "message1";
        String message2 = "message2";
        personOne.notice(message1);
        personTwo.notice(message2);
    }
}
