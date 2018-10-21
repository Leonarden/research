package com.res.emorobots;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import com.res.emorobots.command.RobotAction;
import com.res.emorobots.command.RobotCommand;
import com.res.emorobots.data.Order;
import com.res.emorobots.observer.Observer;
import com.res.emorobots.observer.RobotObserver;
import com.res.emorobots.subject.OrdersSubject;
import com.res.emorobots.util.ObserverStatus;

public class App {

	public static void main(String[] args) {
		
		List<Order> sorders = new LinkedList<Order>();
		Order o;
		List<Double> wsv,wsc;
		RobotObserver obs;
		List<Double> angerLevels, happyLevels, fearLevels;
		String[] ord;   
		Integer obsLimit = 0;  // stress resistance 0 fewer
		Integer sysLimit = 0; // system stress resistance 0 fewer
		Integer criteria = 2;  // 0 first observer end ends app, 1 half observers end ends app, 2 all observer end ends app
		Integer detachMode = 0;
	   Map<String,String> cmdsactsname = new HashMap<String,String>();
		
		OrdersSubject os = new OrdersSubject(1000,sysLimit);
		
		ord =  "Do#the laundry".split("#");
		wsv = (List<Double>) Arrays.asList(5d,5d,1d); // 5 anger, 5 happy, 1 fear  //action so anger, action so happy, uncertain so fear
		wsc = Arrays.asList(7d,2d,2d); // 6 anger, 5 happy, 2 fear //...
		//what to do with this order
	   cmdsactsname.put("com.res.emorobots.command.RobotCommand","com.res.emorobots.command.RobotAction");
		//cmdsactsname.put("com.res.emorobots.command.RobotCommand","com.res.emorobots.command.RobotAction"); PUT further implementations
		o = new Order(ord[0],ord[1],wsv,wsc,cmdsactsname);
	
		sorders.add(o);
		
		ord =  "Do#party".split("#");
		wsv = Arrays.asList(5d,5d,1d); // 5 anger, 5 happy, 1 fear  //action so anger, action so happy, uncertain so fear
		wsc = Arrays.asList(1d,8d,1d); // base levels and very happy...
		//what to do with this order
		 cmdsactsname.put("com.res.emorobots.command.RobotCommand","com.res.emorobots.command.RobotAction");
		//cmdsactsname.put("com.res.emorobots.command.RobotCommand","com.res.emorobots.command.RobotAction"); PUT further implementations
		o = new Order(ord[0],ord[1],wsv,wsc,cmdsactsname);
			
		sorders.add(o);
		sysLimit = ObserverStatus.getStatusLen();
		

	   os.setData(sorders);
	   
	   //mean
	   angerLevels = Arrays.asList(3d, 6d, 9d);  //mean mood
	   happyLevels = Arrays.asList(3d, 6d, 9d);  
	   fearLevels = Arrays.asList(3d, 6d, 9d);  
	   obsLimit = ObserverStatus.getStatusLen() -2;
	   obs = new RobotObserver(1,obsLimit,os, angerLevels, happyLevels, fearLevels);
		os.attach(obs);
	   
	   //sensitive
	   angerLevels = Arrays.asList(1d, 4d, 6d); 
	   happyLevels = Arrays.asList(1d, 4d, 6d); 
	   fearLevels = Arrays.asList(1d, 4d, 6d);  
	   obsLimit = ObserverStatus.getStatusLen() -3;
	    obs = new RobotObserver(1,obsLimit,os, angerLevels, happyLevels, fearLevels);
		 os.attach(obs);
	   
	
	 //cold
	   angerLevels = Arrays.asList(4d, 7d, 10d); 
	   happyLevels = Arrays.asList(4d, 7d, 10d); 
	   fearLevels = Arrays.asList(4d, 7d, 10d);  
	   obsLimit = ObserverStatus.getStatusLen()-1;
	   obs = new RobotObserver(1,obsLimit,os, angerLevels, happyLevels, fearLevels);
	   os.attach(obs);
	   
	while(! globalLimits(os, criteria.intValue(), detachMode.intValue())) {
	    /* setting new orders
	     * 
		ord =  "Be#happy".split("#");
		wsv = Arrays.asList(3d,5d,1d); // 3 anger, 5 happy, 1 fear  //behavioural action so anger, action so happy, uncertain so fear
		wsc = Arrays.asList(1d,8d,1d); // 1 anger, 8 happy, 1 fear //...
		
		o = new Order(ord[0],ord[1],wsv,wsc);
	
		sorders.add(o);
		
		ord =  "Hate#you".split("#");
		wsv = Arrays.asList(6d,1d,8d); // 6 anger, 1 happy, 8 fear  //action so anger, action so happy, uncertain so fear
		wsc = Arrays.asList(5d,1d,1d); // base
			
		o = new Order(ord[0],ord[1],wsv,wsc);
			
		sorders.add(o);
	
	     */
		//os.setData(sorders);
		sorders = os.processOrders(os.notifyTo());
		
	}
	String systemStatus = os.getStatus();
	
	System.out.println("System ended: " + systemStatus);
	
	System.exit(0);
	
	
	}
	
	static boolean globalLimits(OrdersSubject os, int criteria, int dmode) {
		boolean islimit = false;
		int falseCount = 0;
		List<Boolean> limits = new ArrayList<Boolean>();
		List<RobotObserver> obs = (List<RobotObserver>) os.getObservers();
		
		for(int i=0;i<obs.size();i++) {
			limits.add( new Boolean(obs.get(i).limitReached()));
			
			if(!limits.get(i)) {
				falseCount = falseCount+1;
				os.detach(obs.get(i), command, mode);
			}
			
			if(criteria==0 && !limits.get(i)) {
				islimit = true;
			    break;
			}
			if(criteria==1 && !limits.get(i) &&
				falseCount==(Math.abs(obs.size())/2)) {
					islimit = true;
					break;
				}
			
			if(criteria==2 && !limits.get(i) &&
					falseCount==(Math.abs(obs.size())-1)) {
						islimit = true;
						break;
					}
				
		
			
		}	
		
		
		return islimit;
	}


}

