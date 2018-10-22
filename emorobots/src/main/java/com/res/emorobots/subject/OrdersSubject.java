package com.res.emorobots.subject;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Queue;

import com.res.emorobots.command.Action;
import com.res.emorobots.command.Command;
import com.res.emorobots.command.RobotCommand;
import com.res.emorobots.data.Order;
import com.res.emorobots.observer.Observer;
import com.res.emorobots.observer.RobotObserver;

public class OrdersSubject  extends Subject<Queue<Observer<List<Order>>>,Observer<List<Order>>, Queue<Command<Collection<Action<List<Order>>>,List<Order>>>,List<Order>>{

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
		int cnt = 0;
		for(Observer<List<Order>> o: this.observers) {
			 r = o.update(ord);
			this.data = processReentrantOrders(r);
			cnt++;
		}
		
			return this.data;
	}


	/*
	 * 
	 */
  public 	List<Order> processOrders(List<Order> o){
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
		if(isRentrant)
			this.reentrantOrders.add(filtered);
		
		for(Collection<Order> r:this.reentrantOrders) {
			filtered = (List<Order>) r;
			for(Order ord: filtered) {
				//result.add(ord);
			}
		}
		return result;
	}
	
	public boolean limitReached(List<Order> io) {
		//..processing
		return islimit;
		
		
	}

	public String getStatus() {
		return this.status.toString();
	}

	@Override
	public  Queue<Observer<List<Order>>> getObservers(){
		return this.observers;
	}
}
