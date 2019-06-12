package observer;

public class ObserverThree implements Observer {
	private String bname ="观察者Three";
	public void update(String message, String name) {
		System.out.println(bname+":"+"收到"+name+"消息，内容："+message);
	}

}
