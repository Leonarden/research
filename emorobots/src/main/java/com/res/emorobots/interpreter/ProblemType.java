package com.res.emorobots.interpreter;

import java.util.HashMap;
import java.util.Map;

public class ProblemType {

	static Map<String,String> types = new HashMap<String,String>();

	static {
		
		types.put("multi", "problemtype1-problemtype2...");
		
		
	};
	
public ProblemType() {
	
}	
	
	public static String getProblemType(String k) {
		
		return types.get(k);
		
	
	}

}
