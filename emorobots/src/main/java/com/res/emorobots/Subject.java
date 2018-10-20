package com.res.emorobots;

import java.util.List;

public class Subject<T>{
  private  long id;
	private T data;
   protected List<Observer> observers;
   
   public Subject() {
	   this.id = (long)Math.random();
   }
   public Subject(long id) {
	   this.id = id;
   }
	public void attach(Observer o) {}
	public void detach(Observer o) {}

	public T notifyTo() {
	T d = null;
        for(Observer o: observers) {
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
	public List<Observer> getObservers() {
		return observers;
	}
	public void setObservers(List<Observer> observers) {
		this.observers = observers;
	}
	T processData(T d) {
		return null;
	}
}
