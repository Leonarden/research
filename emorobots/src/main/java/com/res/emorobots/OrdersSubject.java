package com.res.emorobots;

import java.util.List;

public class OrdersSubject  extends Subject<List<Order>>{

	List<List<Order>> reentrantOrders;
	
	public OrdersSubject() {
		
	}
	
	
	
	public List<Order> notify(List<Order> ord) {
		List<Order> r = null;
		RobotObserver ro = null;
		for(int i = 0;i<this.observers.size();i++) {
			ro =  (RobotObserver)this.observers.get(i);
			r = ro.update(ord);
			this.reentrantOrders.add(i, r);
			this.setData(processOrders(r));
		}
		
			return this.getData();
	}


	/*
	 * 
	 */
	List<Order> processOrders(List<Order> o){
		return null;
	}

}
