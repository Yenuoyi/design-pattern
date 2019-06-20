package factory;

/**
 * @author yebing
 */

public enum ShapeEnum {
    CIRCLE("CIRCLE","factory.Circle"),
    RECTANGLE("CIRCLE","factory.Circle"),
    SQUARE("CIRCLE","factory.Circle");
    private String name;
    private String address;
    ShapeEnum(String name,String address){
        this.name = name;
        this.address = address;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getIndex() {
        return this.ordinal() + 1;
    }
}
