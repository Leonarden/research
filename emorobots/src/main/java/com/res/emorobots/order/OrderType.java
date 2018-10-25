package com.res.emorobots.order;

import java.util.HashMap;
import java.util.Map;

public class OrderType {

		static Map<Integer,String> types = new HashMap<Integer,String>();

		static {
			//different types of orders with different types of problems to solve
			types.put(0, "");
			types.put(1,"");
			types.put(2,"");
			types.put(3,"");
			types.put(4,"");
			types.put(9, "");	
		};
		
	public OrderType() {
		
	}	
		
		public static String getOrderType(Integer i) {
			
			return types.get(i);
			
		
		}

	}


