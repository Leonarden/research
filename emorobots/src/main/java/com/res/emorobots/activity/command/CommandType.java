package com.res.emorobots.activity.command;

import java.util.HashMap;
import java.util.Map;

public class CommandType {
	static Map<String,String> types = new HashMap<String,String>();

	static {
		
		types.put("multi", "commandtype1-commandtype2...");
		
		
	};
	
public CommandType() {
	
}	
	
	public static String getCommandType(String k) {
		
		return types.get(k);
		
	
	}


}
