package com.res.emorobots.subject;

import java.util.List;

import com.res.emorobots.command.Command;
import com.res.emorobots.observer.Observer;

public class Subject<T>{
  private  long id;
	private T data;
   protected List<Observer<T>> observers;
   List<Command<T>> commands;
   List<Integer> modes;
   
   public Subject() {
	   this.id = (long)Math.random();
   }
   public Subject(long id) {
	   this.id = id;
   }
	public void attach(Observer<T> o) {}
	public void detach(Observer o) {}

	public void attach(Observer<T>  o,Command<T> c) {}
   // mode on detach could be lazy, deep...
	public void detach(Observer<T>  o,Integer mode) {}
	// lazy mode to detach observer's command
	public void detach(Observer<T>  o,Command<T>command, Integer mode) {}

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
	public List<Observer<T>> getObservers() {
		return observers;
	}
	public void setObservers(List<Observer<T>> observers) {
		this.observers = observers;
	}
	T processData(T d) {
		return null;
	}
}
