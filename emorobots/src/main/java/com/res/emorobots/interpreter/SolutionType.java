package com.res.emorobots.interpreter;

import java.util.HashMap;
import java.util.Map;

public class SolutionType {


	static Map<String,String> types = new HashMap<String,String>();

	static {
		
		types.put("multi", "solutiontype1-solutiontype2...");
		
		
	};
	
public SolutionType() {
	
}	
	
	public static String getSolutionType(String k) {
		
		return types.get(k);
		
	
	}
}
