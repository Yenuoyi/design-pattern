package iterator;

/**
 * @author yebing
 */
public interface Iterator {
	/**
	 * 是否还有下一个对象
	 * @return
	 */
	   boolean hasNext();

	/**
	 * 返回下一个对象
	 * @return
	 */
	   Object next();
	}
