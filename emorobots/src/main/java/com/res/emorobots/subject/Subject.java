package com.res.emorobots.subject;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;

import com.res.emorobots.observer.Observer;
import com.res.emorobots.command.CommandBean;
import com.res.emorobots.interpreter.OrderProxy;

public class Subject {
    long id;
    Stack<OrderProxy> data;
    Queue<Observer<Stack<OrderProxy>>> observers;
   
   List<Integer> modes;
   
   public Subject() {
	   this.id = (long)Math.random();
   }
   public Subject(long id) {
	   this.id = id;
   }
	public void attach(Observer<Stack<OrderProxy>> o) {}
	public void detach(Observer<Stack<OrderProxy>> o) {}

	public void attach(Observer<Stack<OrderProxy>>  o,Map<Long,CommandBean> cmdb) {}
   // mode on detach could be lazy, deep...
	public void detach(Observer<Stack<OrderProxy>>  o,Integer mode) {}
	// lazy mode to detach observer's command
	public void detach(Observer<Stack<OrderProxy>>  o, Map<Long,CommandBean> cmdb, Integer mode) {}

	public Stack<OrderProxy> notifyTo() {
	Stack<OrderProxy> d =  this.data;
        for(Observer<Stack<OrderProxy>>  o: observers) {
        	d = o.update(data);
        	
        	data = processData(d);
        }
        
	return data;
	}

	public Stack<OrderProxy> getData() {
	
		return this.data;
		
	}
	
	
	public void setData(Stack<OrderProxy> d) {
		this.data = d;
	}

	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Queue<Observer<Stack<OrderProxy>>> getObservers() {
		return observers;
	}
	public void setObservers(Queue<Observer<Stack<OrderProxy>>> observers) {
		this.observers = observers;
	}
	Stack<OrderProxy> processData(Stack<OrderProxy> d) {
		return null;
	}

}
