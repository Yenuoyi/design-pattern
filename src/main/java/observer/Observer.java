package observer;

/**
 * @author yebing
 */
public interface Observer {
	/**
	 * 更新消息
	 * @param message
	 * @param name
	 */
	void update(String message, String name);
}
