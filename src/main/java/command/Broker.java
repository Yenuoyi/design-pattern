package command;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yebing
 */
public class Broker {
	private List<Order> orderList = new ArrayList<Order>(); 
	public void takeOrder(Order order){
		orderList.add(order);        
		}

	public void placeOrders(){
		for (Order order : orderList) {
			order.execute();
			}
		orderList.clear();
		}
	}
