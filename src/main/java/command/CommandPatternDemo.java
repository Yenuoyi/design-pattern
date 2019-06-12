package command;

/**
 * @author yebing
 */
public class CommandPatternDemo {
    public static void main(String[] args) {
        Stock abcStock = new Stock();
        //实例化buy、sell类
        BuyStock buyStockOrder = new BuyStock(abcStock);
        SellStock sellStockOrder = new SellStock(abcStock);

        //进行命令下发
        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        //依次执行命令
        broker.placeOrders();
    }
}
