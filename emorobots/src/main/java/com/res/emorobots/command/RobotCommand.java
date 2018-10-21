package com.res.emorobots.command;

import java.util.List;

import com.res.emorobots.data.Order;

public class RobotCommand extends Command<List<Order>>{
	

	public RobotCommand(List<Order> d) {
	  this.data = d;	
	}
	public RobotCommand(List<Order> d, RobotAction action) {
		this.data = d;
		this.action = action;
		
	}
	
	public List<Order> execute() {
		List<Order> d;
		d = ((RobotAction)this.action).initalize(this.data);
		this.data = d;
		d = ((RobotAction)this.action).preprocess(d);
		this.data = d;
		d = ((RobotAction)this.action).process(d);
		this.data = d;
		d = ((RobotAction)this.action).postprocess(d);
		this.data =d;
		d = ((RobotAction)this.action).finalize(this.data);
		
		this.data = d;
		return d;
	}
	
	
}
