package com.res.emorobots;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Order {

	private Map<String,Object> verb;
	private Map<String,Object> complement;
	 
	public Order() {
		verb = new HashMap<String,Object>();
		complement = new HashMap<String,Object>();
		//default initialization
		
		List<Integer> em1 = Arrays.asList(0,0,0);
		verb.put("text", "");
		verb.put("weight", em1);
		
		complement.put("text", "");
		complement.put("weight", Arrays.asList(0,0,0));
		
	}

	 public String getVerbText() {
		 return (String) verb.get("text");
	 }

	 public List<Integer> getVerbWeight() {
		 
		 return (List<Integer>) verb.get("weight");
	 }

	 public String getComplementText() {
		 return(String) complement.get("text");
	 }

	 public List<Integer> getComplementWeight() {
		 return (List<Integer>) complement.get("weight");

	 }

   public void setVerbText(String v) {
	   verb.put("text", v);
   }
	 
   public void setComplementWeight(List<Integer> w) {
	   
	   complement.put("weight", w);
   }


}
