package com.res.emorobots.activity.command;

import java.util.Collection;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

import com.res.emorobots.activity.CommandActivity;
import com.res.emorobots.activity.action.Action;
import com.res.emorobots.exception.CommandException;
import com.res.emorobots.interpreter.Definition;
import com.res.emorobots.interpreter.Problem;
import com.res.emorobots.interpreter.Solution;
import com.res.emorobots.order.Order;


public class Command<T1 extends Queue<Action<?>>,T extends Collection<?>> extends CommandActivity{
	T data;
    T1 actions;
    public Command() {}
    public Command(T data) {
    	this.data = data;
    }
    public Command(Collection<?> data, Collection<?> actions) {
    	this.data = (T) data;
    	this.actions = (T1) actions;
    }
public 	T execute() {
	
		T d = null;
		T ld = this.data;
	    
		d = ld;
		
	    try {
	    for(Action<?> ra:actions) {
		
			d = ra.preprocess(d);
			if(d!=null)
				d = ra.process(d);
			if(d!=null)
			d = ra.postprocess(d);
		}
		}catch(CommandException cex) {
			cex.printStackTrace();
			d = null;
		}
		if(d!=null)
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
