package com.res.emorobots.activity.action;

import java.util.HashMap;
import java.util.Map;

public class ActionType {
	static Map<String,String> types = new HashMap<String,String>();

	static {
		
		types.put("multi", "actiontype1-actiontype2...");
		
		
	};
	
public ActionType() {
	
}	
	
	public static String getActionType(String k) {
		
		return types.get(k);
		
	
	}

}
