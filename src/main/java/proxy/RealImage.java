package proxy;

/**
 * @author yebing
 */
public class RealImage implements Image {

    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadImage(fileName);
    }

    @Override
    public void display() {
        System.out.println("display：" + fileName);
    }

    public void loadImage(String fileName) {
        System.out.println("Loading:" + fileName);
    }
}
