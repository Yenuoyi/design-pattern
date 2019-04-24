package abstractfactory;

/**
 * @author yebing
 */

public enum ShapeEnum {
    CIRCLE("CIRCLE"),RECTANGLE("RECTANGLE"),SQUARE("SQUARE");
    private String desc;
    ShapeEnum(String desc){
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getIndex(){
        return this.ordinal() +1;
    }
}
