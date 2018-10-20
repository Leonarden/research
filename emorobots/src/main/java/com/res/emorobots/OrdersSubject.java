package com.res.emorobots;

import java.util.List;

public class OrdersSubject  extends Subject<List<Order>>{

	String status;
	List<List<Order>> reentrantOrders;
	boolean islimit = false;
	
	public OrdersSubject() {}
	public OrdersSubject(long id) {
		this.setId(id);
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
	
	boolean limitReached(List<Order> io) {
		//..processing
		return islimit;
		
		
	}

	public String getStatus() {
		return this.status.toString();
	}
}
