package com.res.emorobots;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import com.res.emorobots.util.ObserverStatus;

public class App {

	public static void main(String[] args) {
		
		List<Order> sorders = new LinkedList<Order>();
		Order o;
		List<Integer> wsv,wsc;
		RobotObserver obs;
		List<Integer> angerLevels, happyLevels, sadLevels;
		String[] ord;   
		Integer obsLimit = 0;  // stress resistance 0 fewer
		Integer sysLimit = 0; // system stress resistance 0 fewer
		
		ord =  "Do#the laundry".split("#");
		wsv = Arrays.asList(5,5,1); // 5 anger, 5 happy, 1 sad  //action so anger, action so happy, uncertain so sad
		wsc = Arrays.asList(7,2,2); // 6 anger, 5 happy, 2 sad //...
		
		o = new Order(ord[0],ord[1],wsv,wsc);
	
		sorders.add(o);
		
		ord =  "Do#party".split("#");
		wsv = Arrays.asList(5,5,1); // 5 anger, 5 happy, 1 sad  //action so anger, action so happy, uncertain so sad
		wsc = Arrays.asList(1,8,1); // base levels and very happy...
			
		o = new Order(ord[0],ord[1],wsv,wsc);
			
		sorders.add(o);
		sysLimit = ObserverStatus.getStatusLen();
		OrdersSubject os = new OrdersSubject(1000,sysLimit);

	   os.setData(sorders);
	   
	   //mean
	   angerLevels = Arrays.asList(3, 6, 9);  //mean mood
	   happyLevels = Arrays.asList(3, 6, 9);  
	   sadLevels = Arrays.asList(3, 6, 9);  
	   obsLimit = ObserverStatus.getStatusLen() -2;
	   obs = new RobotObserver(1,obsLimit,os, angerLevels, happyLevels, sadLevels);
		os.attach(obs);
	   
	   //sensitive
	   angerLevels = Arrays.asList(1, 4, 6); 
	   happyLevels = Arrays.asList(1, 4, 6); 
	   sadLevels = Arrays.asList(1, 4, 6);  
	   obsLimit = ObserverStatus.getStatusLen() -3;
	    obs = new RobotObserver(1,obsLimit,os, angerLevels, happyLevels, sadLevels);
		 os.attach(obs);
	   
	
	 //cold
	   angerLevels = Arrays.asList(4, 7, 10); 
	   happyLevels = Arrays.asList(4, 7, 10); 
	   sadLevels = Arrays.asList(4, 7, 10);  
	   obsLimit = ObserverStatus.getStatusLen()-1;
	   obs = new RobotObserver(1,obsLimit,os, angerLevels, happyLevels, sadLevels);
	   os.attach(obs);
	   
	while(! os.limitReached(sorders)) {
	    /* setting new orders
	     * 
		ord =  "Be#happy".split("#");
		wsv = Arrays.asList(3,5,1); // 3 anger, 5 happy, 1 sad  //behavioural action so anger, action so happy, uncertain so sad
		wsc = Arrays.asList(1,8,1); // 1 anger, 8 happy, 1 sad //...
		
		o = new Order(ord[0],ord[1],wsv,wsc);
	
		sorders.add(o);
		
		ord =  "Hate#you".split("#");
		wsv = Arrays.asList(6,1,8); // 6 anger, 1 happy, 8 sad  //action so anger, action so happy, uncertain so sad
		wsc = Arrays.asList(5,1,1); // base
			
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
}
