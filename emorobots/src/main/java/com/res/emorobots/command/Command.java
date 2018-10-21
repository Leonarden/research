package com.res.emorobots.command;

import java.util.List;

public class Command<T> {
	T data;
    List<Action<T>> actions;
    public Command() {}
    public Command(T data) {
    	this.data = data;
    }
    public Command(T data, List<Action<T>> actions) {
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
	public List<Action<T>> getActions() {
		return actions;
	}
	public void setActions(List<Action<T>> actions) {
		this.actions = actions;
	}

}
