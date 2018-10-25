package com.res.emorobots.order;

import java.util.HashMap;
import java.util.Map;

public class OrderType {

		static Map<String,String> types = new HashMap<String,String>();

		static {
			//different types of orders with different types of problems to solve
			//different types of orders with different types of problems to solve
			types.put("math", "alge-diff-");
			types.put("nlp","nlpsys1-nplsys2-nlpsysX");
			types.put("indus", "indussys1-indussys2-indussysX");
			types.put("comp", "perf-codegen-");
			types.put("med","");
			types.put("chem","");
			types.put("multi","multiord1");
			};
		
	public OrderType() {
		
	}	
		
		public static String getOrderType(Integer i) {
			
			return types.get(i);
			
		
		}

	}


