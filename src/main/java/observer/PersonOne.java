package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yebing
 */
public class PersonOne implements Person {
    private String name = "通知者One";

    /** 观察者列表 */
    private List<Observer> observerList = new ArrayList<Observer>();

    public void addObserver(Observer observer) {
        if(!observerList.contains(observer)){
            observerList.add(observer);
        }
    }

    public void removeObserver(Observer observer) {
        if(observerList.contains(observer)){
            observerList.remove(observer);
        }
    }

    public void notice(String message) {
        for(Observer observer:observerList){
            observer.update(message,name);
        }
    }
}

