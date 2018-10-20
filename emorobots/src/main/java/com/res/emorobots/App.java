package com.res.emorobots;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		
		List<Order> sorders = new LinkedList<Order>();
		Order o;
		List<Integer> wsv,wsc;
		RobotObserver obs;
		List<Integer> angerLevels, happyLevels, sadLevels;
		String[] ord;   
		
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
		
		OrdersSubject os = new OrdersSubject(1000);

	   os.setData(sorders);
	   
	   //mean
	   angerLevels = Arrays.asList(3, 6, 9);  //mean mood
	   happyLevels = Arrays.asList(3, 6, 9);  
	   sadLevels = Arrays.asList(3, 6, 9);  
	   obs = new RobotObserver(1,os, angerLevels, happyLevels, sadLevels);
		os.attach(obs);
	   
	   //sensitive
	   angerLevels = Arrays.asList(1, 4, 6); 
	   happyLevels = Arrays.asList(1, 4, 6); 
	   sadLevels = Arrays.asList(1, 4, 6);  
	   obs = new RobotObserver(2,os, angerLevels, happyLevels, sadLevels);
	   os.attach(obs);
	   
	
	 //cold
	   angerLevels = Arrays.asList(4, 7, 10); 
	   happyLevels = Arrays.asList(4, 7, 10); 
	   sadLevels = Arrays.asList(4, 7, 10);  
	   obs = new RobotObserver(3,os, angerLevels, happyLevels, sadLevels);
	   os.attach(obs);
	   
	while(! os.limitReached(sorders)) {
	    /* setting new orders
	     * 
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
	
	     */
		//os.setData(sorders);
		sorders = os.processOrders(os.notifyTo());
	}
	String systemStatus = os.getStatus();
	
	System.out.println("System ended: " + systemStatus);
	
	System.exit(0);
	
	
	}
}
