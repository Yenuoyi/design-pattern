package command;

/**
 * 实现命令类，构造自身对象时实例化stock类，并通过execute间接调用stock.sell()方法
 *
 * @author yebing
 */
public class SellStock implements Order {
    private Stock abcStock;

    public SellStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.sell();
    }
}
