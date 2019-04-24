package flyweight;

import java.util.Random;

/**
 * @author yebing
 */
public class AirTicket implements Ticket {
    public String from;
    public String to;
    public String bunk;
    public int price;

    public AirTicket(String from, String to, String bunk) {
        this.from = from;
        this.to = to;
        this.bunk = bunk;
    }

    @Override
    public void showTicket() {
        price = new Random().nextInt(300);
        System.out.println("From：" + from + "--To：" + to + "--Bunk：" + bunk + "--Price：" + price);
    }
}
