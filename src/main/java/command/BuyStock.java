package command;

/**
 * 实现命令类，构造自身对象时实例化stock类，并通过execute间接调用stock.buy()方法
 *
 * @author yebing
 */
public class BuyStock implements Order {
    private Stock abcStock;

    public BuyStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.buy();
    }
}
