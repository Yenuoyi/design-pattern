package builder;

/**
 * 建造Person对象指导器
 * @author yebing
 */
public class PersonDirector {
	public Person director(){
		ConcreteBuildMan man = new ConcreteBuildMan();
		man.buildBody();
		man.buildFoot();
		man.buildHand();
		man.buildHead();
		return man.buildPerson();
	}
}
