package abstractfactory;

/**
 * @author yebing
 */
public abstract class AbstractFactory {
	/**
	 * 生成对象抽象方法
	 * @param shape
	 * @return
	 */
	abstract Shape getShape(String shape);
}
