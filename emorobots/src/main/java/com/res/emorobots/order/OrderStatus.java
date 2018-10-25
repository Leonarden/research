package com.res.emorobots.order;

import java.util.HashMap;
import java.util.Map;

public class OrderStatus {

	static Map<Integer,String> status = new HashMap<Integer,String>();
	static {
		status.put(0, "solved");
		status.put(1,"comleted");
		status.put(2,"pending");
		status.put(3,"uresolved");
		status.put(4,"discarded");
		status.put(9, "unknown");	
	};
	
public OrderStatus() {
	
}	
	
	public static String getOrderStatus(Integer i) {
		
		return status.get(i);
		
	
	}

}
