package com.res.emorobots.observer;

import java.util.HashMap;
import java.util.Map;

public class ObserverType {


			static Map<String,String> types = new HashMap<String,String>();

			static {
				//different types of orders with different types of problems to solve
				types.put("math", "mathlabeng-mapplebasedeng");
				types.put("nlp","nlpsys1-nplsys2-nlpsysX");
				types.put("indus", "indussys1-indussys2-indussysX");
				types.put("comp", "simulation-codegen");
				types.put("med","");
				types.put("chem","chemsys1");
				types.put("multi","multisys1");
		
			};
			
	
			public static String getObserverType(String key) {
				
				return types.get(key);
				
			
			}


}




