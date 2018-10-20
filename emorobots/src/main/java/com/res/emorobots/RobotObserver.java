package com.res.emorobots;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RobotObserver extends Observer<List<Order>> implements RobotCallback{

	Map<Integer,String> sysstat = new HashMap<Integer,String>();
	private Subject subject;
	//eActLevel is a Map containing and ordered list of <emotion,transitions of emotion list>
	private Map<String,List<Integer>> eActLevel;
	private Map<String,Long> emotions;
	List<Order> reentrantO;
	StringBuffer status = new StringBuffer();
	Integer updates = 0;
	Integer stresslevel = 0;
	
	public RobotObserver(long id, OrdersSubject s,List<Integer> angerLevels, List<Integer> happyLevels, List<Integer> sadLevels) {
		this.id = id;
		eActLevel = new HashMap<String,List<Integer>>();
	   emotions = new HashMap<String,Long>();
	   eActLevel.put("anger", angerLevels);
	   eActLevel.put("happy", happyLevels);
	   eActLevel.put("sad", sadLevels);
	   
	   emotions.put("anger", 0l);
	   emotions.put("happy", 0l);
	   emotions.put("sad", 0l);
	   subject = s;
	   data = s.getData();
	
	   sysstat.put(0,"VERY CALM");
	   sysstat.put(1,"CALM");
	   sysstat.put(2,"AVERAGE");
	   sysstat.put(3,"BIT STRESSED");
	   sysstat.put(4,"STRESSED");
	   sysstat.put(5,"OVERFLOWN");
	   
	   
	   
	   
	}

	public List<Order> update(List<Order> o) {
		// reentrant Orders
		reentrantO = processOrders(o);
		this.data = this.callback(reentrantO);
		return data;
	}
	
	public List<Order> callback(List<Order> o) {
		List<Order> reeOrder = null;
		//processing
		
		return reeOrder;
	}
	
	public void callback() {
		
	}
	
	public void reset() {
		data = new ArrayList<Order>();
		 emotions.put("anger", 0l);
		 emotions.put("happy", 0l);
		  emotions.put("sad", 0l);
		  
	}
	
	List<Order> processOrders(List<Order> o){
	    boolean ischange = false;
		updates++;	
		if(ischange)
			status.append("Robot " + id + "at update " + updates + " is: "+ sysstat.get(stresslevel) );
		return null;
	}
	
	public String getStatus() {
		return this.status.toString();
	}
	
	String checkAction() {
		String em = "";
       List<Long> l = new ArrayList(emotions.values());
       List<String> e = new ArrayList(emotions.keySet());
       List<Long> al = new ArrayList(eActLevel.values());
       List<String> ae = new ArrayList(eActLevel.keySet());
       for(int i=0;i<emotions.size();i++) 
    	   if((Long) l.get(i) >= (Long) al.get(i))
    		   em = em + e.get(i);
    	   
    	   
       
       return em;
		
		
	} 

	public void act(String ems)
	{
		if(ems!=null && !ems.equals("")) {
			
			if(ems.contains(("anger"))) 
				doAnger();
			if(ems.contains("happy"))
				doHappy();
			if(ems.contains("sad"))
				doSad();
			
			
			
			
		}
	}
	 void	doAnger() {
			
		}
		
	 void	 doHappy() {
			
		}
		void doSad() {
			
		}
	
}	
	

