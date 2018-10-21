package com.res.emorobots.observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.res.emorobots.command.RobotCommand;
import com.res.emorobots.data.Order;
import com.res.emorobots.subject.OrdersSubject;
import com.res.emorobots.subject.Subject;
import com.res.emorobots.util.ObserverStatus;

public class RobotObserver extends Observer<List<Order>> implements RobotCallback{

	Map<Integer,String> sysstat = new HashMap<Integer,String>();
	private Subject subject;
	//eActLevel is a Map containing and ordered list of <emotion,transitions of emotion list>
	private Map<String,List<Double>> eActLevel;
	private Map<String,Double> emotions;
	List<Order> reentrantO;
	StringBuffer status = new StringBuffer();
	Integer updates = 0;
	Integer limit = 0;
	Integer stresslevel = 0;
	
	public RobotObserver(long id,int limit, OrdersSubject s,List<Double> angerLevels, List<Double> happyLevels, List<Double> fearLevels) {
		this.id = id;
		eActLevel = new HashMap<String,List<Double>>();
	   emotions = new HashMap<String,Double>();
	   eActLevel.put("anger", angerLevels);
	   eActLevel.put("happy", happyLevels);
	   eActLevel.put("fear", fearLevels);
	   
	   emotions.put("anger", 1d);
	   emotions.put("happy", 1d);
	   emotions.put("fear", 1d);
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
	
	public List<Order> callback(List<Order> ords) {
		List<Order> l = null;
		List<RobotCommand> cmds;
		//processing
		for(Order o: ords) {
			cmds = o.getCommands();
			l = ords;
			for(RobotCommand c:cmds) {
				l = c.execute();
				c.setData(l);
			}
		}
		return l;
	}
	
	public void callback() {
		
	}
	
	public void reset() {
		data = new ArrayList<Order>();
		 emotions.put("anger", 1d);
		 emotions.put("happy", 1d);
		  emotions.put("fear", 1d);
		  
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
	public boolean limitReached() {
		return (stresslevel>= this.limit);
	}
	
	String checkAction() {
		String em = "";
       List<Double> l = new ArrayList(emotions.values());
       List<String> e = new ArrayList(emotions.keySet());
       List<List<Double>> al = new ArrayList(eActLevel.values());
       List<String> ae = new ArrayList(eActLevel.keySet());
       for(int i=0;i<e.size();i++) { 
    	 List<Double> a = (List<Double>) al.get(i);
    	 
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
			if(ems.contains("fear"))
				doFear();
			
			
			
			
		}
	}
	 void	doAnger() {
			
		}
		
	 void	 doHappy() {
			
		}
		void doFear() {
			
		}
	
}	
	

