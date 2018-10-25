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
import com.res.emorobots.interpreter.OrderStatus;
import com.res.emorobots.observer.Observer;
import com.res.emorobots.observer.RobotObserver;

public class OrdersSubject  extends Subject {

	String status;
	List<Stack<Order>> reentrantOrders;
	boolean islimit = false;
	Long limit = 0l;
	Stack<OrderProxy> completedOrders;
	
	Stack<OrderProxy> discardedOrders;
	
	
	
	public OrdersSubject() {}
	public OrdersSubject(long id, long limit) {
		this.setId(id);
		this.limit = limit;
		
		
	}
	
	
	public Stack<OrderProxy> notifyTo() { {
		Stack<OrderProxy> r = null;
		RobotObserver ro = null;
		int cnt = 0;
		Queue<Observer<Stack<OrderProxy>>> opq = new PriorityQueue<Observer<Stack<OrderProxy>>>();
		Iterator<Observer<Stack<OrderProxy>>> it = this.observers.iterator();
		Observer<Stack<OrderProxy>> obs = null;
		r  = this.data;
		while(it.hasNext()) {
		
			
			r = it.update(r);
		
			r = processReentrantOrders(r);
			
			cnt++;
		
		
		}
			
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
   * @return 
   */
	void Stack<OrderProxy> processReentrantOrders(Stack<OrderProxy> obsOrd){
		boolean isRentrant = false;
		boolean isPending = false;
		List<OrderProxy> filtered = new ArrayList<OrderProxy>();
		Stack<OrderProxy> result = new Stack<OrderProxy>();
		Stack<OrderProxy> pendingOrders = new Stack<OrderProxy>();
		Stack<com.res.emorobots.interpreter.OrderProxy> completedOrders = new Stack<OrderProxy>();
		Stack<OrderProxy> unresolvedOrders = new Stack<OrderProxy>();
		Stack<OrderProxy> discardedOrders = new Stack<OrderProxy>();
		Stack<OrderProxy> unknownOrders = new Stack<OrderProxy>();
		
		OrderStatus ostatus = new OrderStatus();
		//search for completed orders
		for(OrderProxy ord: obsOrd) {
			String status = ostatus.getOrderStatus(ord.getOrderStatus());
			if("pending".equals(status)) {
				pendingOrders.add(ord);
				isPending = true;
			}
			else if("completed".equals(status)) 
				completedOrders.add(ord);
			else if("unresolved".equals(status))
				unresolvedOrders.add(ord);
			else if("discarded".equals(status))
				discardedOrders.add(ord);
			else // this case shouldn't be very frequent
				unknownOrders.add(ord);
		
			if(!isPending)
				obsOrd.remove(ord);
		}
		//if(filtered.size()>0) isRentrant = true;
		Collections.sort(obsOrd, Order);
		
		this.completedOrders.addAll(completedOrders);
		this.discardedOrders.addAll(discardedOrders);
		int n = removeCompletedFromReentrant(completedOrders);
		
		int nr = removeDiscardedFromReentrant(discardedOrders);
		int updtated = 0;
		if(obsOrd!=null) {
			Stack<OrderProxy> orders = updateRentrant(obsOrd);
			result = orders;
		}else
			result = getFromRentrant();
		
			
		return result;
	
	
	}
public int removeCompletedFromReentrant(Stack<OrderProxy> completedOrders2) {
		int rcnt = 0;
		for(Stack<Order> orders: this.reentrantOrders) {
			for(Order ord: orders) {
				for(OrderProxy ordp:completedOrders2) {
					Order o = ordp.getOrder();
					if(o.equals(ord)) {
						orders.remove(o);
						rcnt++;
					}
				}
			}
		}
		return rcnt;
	}
	
 public int removeDiscardedFromReentrant(Stack<OrderProxy> discarded) {
		int rcnt = 0;
		for(Stack<Order> orders: this.reentrantOrders) {
			for(Order ord: orders) {
				for(OrderProxy ordp:discarded) {
					Order o = ordp.getOrder();
					if(o.equals(ord)) {
						orders.remove(o);
						rcnt++;
					}
				}
			}
		}
		return rcnt;
	}
	
 
	public Stack<OrderProxy>  updateRentrant(Stack<OrderProxy> ords) {
	Stack<OrderProxy> ops= new Stack<OrderProxy>();
	
	ops = (Stack<OrderProxy>)ords.clone();
	
		for(Stack<Order> s: this.reentrantOrders) {
			for(Order o: s) {
				for(OrderProxy op: ops) {
					Order order = op.getOrder();
					if(order.equals(o)) {
						
						ops.remove(op);
						if(ords==null)
							return null;
						break;
					}
					
						
				}
			}
			if(ops!=null) { // we add to reentrants
				Stack<Order> so = new Stack<Order>();
				for(OrderProxy op: ops) {
					Order order = op.getOrder();
					so.add(order);
				}
				this.reentrantOrders.add(so);
			}
			return ops;
		}
	}
	
	
	public boolean limitReached(List<Order> io) {
		//..processing
		return islimit;
		
		
	}

	public String getStatus() {
		return this.status.toString();
	}


}
