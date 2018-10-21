package com.res.emorobots.data;

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
		
		List<Double> em1 = Arrays.asList(1d,1d,1d);
		verb.put("text", "");
		verb.put("weight", em1);
		
		complement.put("text", "");
		complement.put("weight", em1);
		
	}
	

	public Order(String verbtext, String comptext, List<Double> vws, List<Double> cws) {
		verb = new HashMap<String,Object>();
		complement = new HashMap<String,Object>();
		
		verb.put("text", verbtext);
		verb.put("weight", vws);
		
		complement.put("text", comptext);
		complement.put("weight", cws);
		
	}
	
	 public String getVerbText() {
		 return (String) verb.get("text");
	 }

	 public List<Double> getVerbWeight() {
		 
		 return (List<Double>) verb.get("weight");
	 }

	 public String getComplementText() {
		 return(String) complement.get("text");
	 }

	 public List<Double> getComplementWeight() {
		 return (List<Double>) complement.get("weight");

	 }

   public void setVerbText(String v) {
	   verb.put("text", v);
   }
	 
   public void setComplementWeight(List<Double> w) {
	   
	   complement.put("weight", w);
   }


}
