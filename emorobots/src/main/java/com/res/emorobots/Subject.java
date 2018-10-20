package com.res.emorobots;

import java.util.List;

public class Subject<T>{
	private T data;
   protected List<Observer> observers;
   
   public Subject() {
	   
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

	T processData(T d) {
		return null;
	}
}
