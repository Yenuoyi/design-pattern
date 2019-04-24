package builder;

/**
 * 最终要建造的对象
 * @author yebing
 */
public class Person {
	private String head;

	private String hand;

	private String foot;

	private String body;

	public String getHead() {
		return head;
	}

	public void setHead(String head) {
		this.head = head;
	}

	public String getHand() {
		return hand;
	}

	public void setHand(String hand) {
		this.hand = hand;
	}

	public String getFoot() {
		return foot;
	}

	public void setFoot(String foot) {
		this.foot = foot;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	@Override
	public String toString() {
		return "Person{" +
				"head='" + head + '\'' +
				", hand='" + hand + '\'' +
				", foot='" + foot + '\'' +
				", body='" + body + '\'' +
				'}';
	}
}
