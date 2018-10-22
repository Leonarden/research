package com.res.emorobots.subject;

import java.util.Collection;
import java.util.List;

import com.res.emorobots.command.Action;
import com.res.emorobots.command.Command;
import com.res.emorobots.observer.Observer;

public class Subject<T1 extends Collection<T2>,T2 extends Observer<T>, T3 extends Collection<Command<Collection<Action<T>>,T>>, T extends Collection<?>>{
    long id;
	 T data;
   protected T1 observers;
   T2 commands;
   List<Integer> modes;
   
   public Subject() {
	   this.id = (long)Math.random();
   }
   public Subject(long id) {
	   this.id = id;
   }
	public void attach(Observer<T> o) {}
	public void detach(Observer<T> o) {}

	public void attach(Observer<T>  o,T3 commands) {}
   // mode on detach could be lazy, deep...
	public void detach(Observer<T>  o,Integer mode) {}
	// lazy mode to detach observer's command
	public void detach(Observer<T>  o,T3 commands, Integer mode) {}

	public T notifyTo() {
	T d = null;
        for(Observer<T>  o: observers) {
        	o.update(data);
        	
        	data = processData(d);
        }
	return data;
	}

	public T getData() {
	
		return this.data;
		
	}
	
	
	public void setData(T d) {
		this.data = d;
	}

	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public T1 getObservers() {
		return observers;
	}
	public void setObservers(T1 observers) {
		this.observers = observers;
	}
	T processData(T d) {
		return null;
	}
}
