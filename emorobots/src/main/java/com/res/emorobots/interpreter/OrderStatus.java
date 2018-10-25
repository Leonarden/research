package com.res.emorobots.interpreter;

import java.util.HashMap;
import java.util.Map;

public class OrderStatus {

	static Map<Integer,String> status = new HashMap<Integer,String>();
	static {
		status.put(0,"comleted");
		status.put(1,"pending");
		status.put(2,"uresolved");
		status.put(3,"discarded");
			
	};
	
public OrderStatus() {
	
}	
	
	public static String getOrderStatus(Integer i) {
		
		return status.get(i);
		
	
	}

}
