package command;

/**
 * @author yebing
 */
public class Stock {
	private String name = "ABC";

	private int quantity = 10;

	public void buy(){
		System.out.println(name+"：buy" + quantity);
	}

	public void sell(){
		System.out.println(name+"：sell " + quantity);
	}
}
