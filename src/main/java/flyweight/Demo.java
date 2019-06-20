package flyweight;

/**
 * 享元模式，共享已存在的票据
 *
 * @author yebing
 */
public class Demo {
    public static void main(String[] args) {
        Ticket toXianAirTicket = AirTicketFactory.getTicket("BeiJing", "XiAn", "100");
        Ticket toBeiJingAirTicket = AirTicketFactory.getTicket("XiAn", "BeiIing", "200");

        toXianAirTicket.showTicket();
        toBeiJingAirTicket.showTicket();
    }
}
