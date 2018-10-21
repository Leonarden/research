package com.res.emorobots.subject;

import java.util.List;

import com.res.emorobots.data.Order;
import com.res.emorobots.observer.Observer;
import com.res.emorobots.observer.RobotObserver;

public class OrdersSubject  extends Subject<List<Order>>{

	String status;
	List<List<Order>> reentrantOrders;
	boolean islimit = false;
	Long limit = 0l;
	
	
	
	public OrdersSubject() {}
	public OrdersSubject(long id, long limit) {
		this.setId(id);
		this.limit = limit;
		
		
	}
	
	
	public List<Order> notify(List<Order> ord) {
		List<Order> r = null;
		RobotObserver ro = null;
		for(int i = 0;i<this.observers.size();i++) {
			ro =  (RobotObserver)this.observers.get(i);
			r = ro.update(ord);
			
			this.reentrantOrders.add(i, r);
			this.setData(processReentrantOrders(r));
		}
		
			return this.getData();
	}


	/*
	 * 
	 */
  public 	List<Order> processOrders(List<Order> o){
	StringBuffer sb = new StringBuffer();	
	  for(int i=0;i<this.observers.size();i++) {
		  //...
		  //status.append()
	  }
	return null;
	}

	List<Order> processReentrantOrders(List<Order> io){
		return null;
	}
	
	public boolean limitReached(List<Order> io) {
		//..processing
		return islimit;
		
		
	}

	public String getStatus() {
		return this.status.toString();
	}

	public 	List<RobotObserver> getObservers(){
		return this.observers;
	}
}
