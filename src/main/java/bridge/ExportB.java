package bridge;

/**
 * 出口B
 * @author yebing
 */
public class ExportB implements Destination{

	@Override
	public void export() {
		System.out.println("This is Export B!");
	}

}
