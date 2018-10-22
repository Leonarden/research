package com.res.emorobots.command;

import java.util.Collection;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

import com.res.emorobots.data.Order;

public class RobotCommand extends Command<Stack<Action<List<Order>>>,List<Order>>{
	

	
	public List<Order> execute() {
		List<Order> d = null;
		for(Action<List<Order>> action:this.actions) {
		d = ((RobotAction)action).initalize(this.data);
		this.data = d;
		d = ((RobotAction)action).preprocess(d);
		this.data = d;
		d = ((RobotAction)action).process(d);
		this.data = d;
		d = ((RobotAction)action).postprocess(d);
		this.data =d;
		d = ((RobotAction)action).finalize(d);
		}
		
		this.data = d;
		return d;
	}
	
	
}
