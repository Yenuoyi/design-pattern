package builder;

/**
 * 建造者方法
 * @author yebing
 */
public class ConcreteBuildMan extends PersonBuild{
	@Override
	public void buildHead() {
		person.setHead("This is head!");
	}

	@Override
	public void buildHand() {
		person.setHand("This is hand");
	}

	@Override
	public void buildFoot() {
		person.setFoot("This is foot");
	}

	@Override
	public void buildBody() {
		person.setBody("This is body");
	}

}
