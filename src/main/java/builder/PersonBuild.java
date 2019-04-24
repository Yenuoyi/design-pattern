package builder;

/**
 * 抽象建造person对象类
 * @author yebing
 */
public abstract class PersonBuild {
	protected Person person = new Person();

	/**
	 * 创建头
	 */
	abstract void buildHead();

	/**
	 * 创建手
	 */
	abstract void buildHand();

	/**
	 * 创建脚
	 */
	abstract void buildFoot();

	/**
	 * 创建身体
	 */
	abstract void buildBody();

	/**
	 * @return
	 */
	public Person buildPerson(){
		return person;
	}
}
