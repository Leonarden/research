package com.res.emorobots.command;

import java.util.Collection;
import java.util.List;

public class Command<T1 extends Collection<Action<T>>,T extends Collection<?>> {
	T data;
    T1 actions;
    public Command() {}
    public Command(T data) {
    	this.data = data;
    }
    public Command(T data, T1 actions) {
    	this.data = data;
    	this.actions = actions;
    }
	T execute() {
		T d = null;
		for(Action<T> ra:actions) {
			d = ra.preprocess(this.data);
			d = ra.process(d);
			d = ra.postprocess(d);
		}
		this.data = d;
		
		return d;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public T1 getActions() {
		return actions;
	}
	public void setActions(T1 actions) {
		this.actions = actions;
	}

}
