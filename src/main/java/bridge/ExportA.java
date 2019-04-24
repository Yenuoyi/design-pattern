package bridge;

/**
 * 出口A
 * @author yebing
 */
public class ExportA implements Destination{

	@Override
	public void export() {
		System.out.println("This is exportA");
	}

}
