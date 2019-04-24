package adaptermode;

/**
 * @author yebing
 */
public class Hotel {
	public static void main(String[] args){
		DbSocketInterface adapter = new SocketAdapter();
		adapter.printDB();
	}
}
