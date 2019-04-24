package bridge;

/**
 * 抽象入口
 * @author yebing
 */
public abstract class Origin {
	Destination destination;

	/**
	 * 抽象入口方法
	 */
	public abstract void entrance();

	/**
	 * 出口
	 */
	public void export(){
		destination.export();
	}
}
