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

}
