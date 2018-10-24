package com.res.emorobots.subject;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

import com.res.emorobots.command.Action;
import com.res.emorobots.command.Command;
import com.res.emorobots.command.RobotCommand;
import com.res.emorobots.command.RobotCommandProxy;
import com.res.emorobots.interpreter.Order;
import com.res.emorobots.interpreter.OrderProxy;
import com.res.emorobots.observer.Observer;
import com.res.emorobots.observer.RobotObserver;

public class OrdersSubject  extends Subject {

	String status;
	List<Stack<Order>> reentrantOrders;
	boolean islimit = false;
	Long limit = 0l;
	
	
	
	public OrdersSubject() {}
	public OrdersSubject(long id, long limit) {
		this.setId(id);
		this.limit = limit;
		
		
	}
	
	
	public Stack<OrderProxy> notifyTo() { {
		Stack<OrderProxy> r = null;
		RobotObserver ro = null;
		int cnt = 0;
		Queue<Observer<Stack<Order>>> opq = new PriorityQueue<Observer<Stack<Order>>>();
		Iterator<Observer<Stack<Order>>> it = this.observers.iterator();
		Observer<Stack<Order>> obs = null;
		while(it.hasNext()) {
			 r = cit.update(ord);
			this.data = processReentrantOrders(r);
			cnt++;
		}
		 this.data
			
		 return (Stack<Order>
	
	}


	/*
	 * 
	 */
  public 	List<Order> processOrders(List<Order<Collection<RobotCommandProxy>>> o){
	StringBuffer sb = new StringBuffer();	
	  for(Observer<List<Order>> obs: this.observers) {
		  //...
		  //status.append()
	  }
	return null;
	}

  /**
   * 
   * @param io : List of orders candidate to be added to rentrant orders
   * @return the main list of orders after processing
   */
	List<Order> processReentrantOrders(List<Order> io){
		boolean isRentrant = false;
		List<Order> filtered = new ArrayList<Order>();
		List<Order> result = new ArrayList<Order>();
		//search for completed orders
		for(Order ord: io) {
			//if(!Order.isCompleted(ord)) filtered.add(ord);
		}
		//if(filtered.size()>0) isRentrant = true;
		Collections.sort(io, Order);
		for(Stack<Order> r:this.reentrantOrders) {
			filtered = (List<Order>) r;
		
			Collections.sort(filtered, c);
		
		}
		if(isRentrant)
			this.reentrantOrders.add(filtered);
		
		return result;
	}
	
	public boolean limitReached(List<Order> io) {
		//..processing
		return islimit;
		
		
	}

	public String getStatus() {
		return this.status.toString();
	}


}
