package command;

/**
 * 命令模式:定义一个命令接口，需要调用的命令需要实现这个接口，
 * 在调用者api类中通过对命令接口列表加入命令接口实现类，最后调用者通过调用实现命令方法实现调用链
 *
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
