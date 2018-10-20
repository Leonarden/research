package com.res.emorobots;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.res.emorobots.util.ObserverStatus;

public class RobotObserver extends Observer<List<Order>> implements RobotCallback{

	Map<Integer,String> sysstat = new HashMap<Integer,String>();
	private Subject subject;
	//eActLevel is a Map containing and ordered list of <emotion,transitions of emotion list>
	private Map<String,List<Integer>> eActLevel;
	private Map<String,Integer> emotions;
	List<Order> reentrantO;
	StringBuffer status = new StringBuffer();
	Integer updates = 0;
	Integer limit = 0;
	Integer stresslevel = 0;
	
	public RobotObserver(long id,int limit, OrdersSubject s,List<Integer> angerLevels, List<Integer> happyLevels, List<Integer> sadLevels) {
		this.id = id;
		eActLevel = new HashMap<String,List<Integer>>();
	   emotions = new HashMap<String,Integer>();
	   eActLevel.put("anger", angerLevels);
	   eActLevel.put("happy", happyLevels);
	   eActLevel.put("sad", sadLevels);
	   
	   emotions.put("anger", 0);
	   emotions.put("happy", 0);
	   emotions.put("sad", 0);
	   subject = s;
	   data = s.getData();
	  this.limit = limit;
	  sysstat = ObserverStatus.getInstance();
	  if(this.limit<0)
		  this.limit =0;;
	  if(this.limit> ObserverStatus.getStatusLen())
		  this.limit = ObserverStatus.getStatusLen()-1;
	   
	   
	   
	}

	public List<Order> update(List<Order> o) {
		// reentrant Orders
		reentrantO = processOrders(o);
		this.data = this.callback(reentrantO);
		return data;
	}
	
	public List<Order> callback(List<Order> o) {
		List<Order> l = null;
		//processing
		
		return l;
	}
	
	public void callback() {
		
	}
	
	public void reset() {
		data = new ArrayList<Order>();
		 emotions.put("anger", 0);
		 emotions.put("happy", 0);
		  emotions.put("sad", 0);
		  
	}
	
	List<Order> processOrders(List<Order> o){
	    boolean ischange = false;
	    List<Order> l = new ArrayList<Order>();
		updates++;	
		for(int i = 0; i< o.size();i++) {
			
		}
		if(ischange)
			status.append("Robot " + id + "at update " + updates + " is: "+ sysstat.get(stresslevel) );
		return null;
	}
	
	public String getStatus() {
		return this.status.toString();
	}
	
	String checkAction() {
		String em = "";
       List<Integer> l = new ArrayList(emotions.values());
       List<String> e = new ArrayList(emotions.keySet());
       List<List<Integer>> al = new ArrayList(eActLevel.values());
       List<String> ae = new ArrayList(eActLevel.keySet());
       for(int i=0;i<e.size();i++) { 
    	 List<Integer> a = (List<Integer>) al.get(i);
    	 
       }
    	   
       
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
	

