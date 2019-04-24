package bridge;

/**
 * 桥接模式demo
 * @author yebing
 */
public class BridgeDemo {
	public static void main(String[] args){
		/* 进行入口选择，对象向上转型*/
		Origin bridge = new EntranceA();
		bridge.entrance();
		System.out.println("Begin start bridging!");
		/* 进行出口实例化 */
		bridge.destination = new ExportA();
		bridge.export();
	}
}
