package com.res.emorobots.command;

public class Command<T> {
	T data;
    Action<T> action;
    public Command() {}
    public Command(T data) {
    	this.data = data;
    }
    public Command(T data, Action<T> action) {
    	this.data = data;
    	this.action = action;
    }
	T execute() {
		T d = null;
		d = action.preprocess(this.data);
		this.data = d;
		d = action.process(d);
		this.data = d;
		d = action.postprocess(d);
		this.data = d;
		return d;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public Action<T> getAction() {
		return action;
	}
	public void setAction(Action<T> action) {
		this.action = action;
	}

}
