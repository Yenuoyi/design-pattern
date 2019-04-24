package adaptermode;

/**
 * 继承gb接口，同时实现db接口
 * @author yebing
 */
public class SocketAdapter extends GbSocketImpl implements DbSocketInterface {
	@Override
	public void printDB() {
		printGB();
	}
	

}
