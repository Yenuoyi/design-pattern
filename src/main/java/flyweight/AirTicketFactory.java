package flyweight;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author yebing
 */
public class AirTicketFactory {
	public static Map<String, Ticket> tickets = new ConcurrentHashMap<String, Ticket>();
	/**
     * @param from
     * @param to
     * @return
     */
    public static Ticket getTicket(String from, String to, String bunk) {
        String key = from + "-" + to+"-"+bunk;
        if (tickets.containsKey(key)) {
            return tickets.get(key);
        }else {
            AirTicket airTicket = new AirTicket(from, to, bunk);
            tickets.put(key, airTicket);
            return airTicket;
        }
    }
}
