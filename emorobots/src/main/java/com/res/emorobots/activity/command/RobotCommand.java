package com.res.emorobots.activity.command;

import java.util.Collection;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

import com.res.emorobots.sentence.Order;

public class RobotCommand extends Command<Stack<Action<List<Order<Collection<RobotCommandProxy>>>>>,List<Order<Collection<RobotCommandProxy>>>>{
	

	
	@SuppressWarnings("unchecked")
	public List<Order<Collection<RobotCommandProxy>>> execute() {
		List<Order> d = null;
		List<Order<Collection<RobotCommandProxy>>> d1 = null;
	try {
		
		for(Action<List<Order<Collection<RobotCommandProxy>>>> action: this.actions) {
		d1 = (List<Order<Collection<RobotCommandProxy>>>)  ((RobotAction)action).initalize(this.data);
		this.data = d1;
		d1 = (List<Order<Collection<RobotCommandProxy>>>)  ((RobotAction)action).preprocess(  d1);
		this.data = d1;
		d1 = (List<Order<Collection<RobotCommandProxy>>>)  ((RobotAction)action).process(d1);
		this.data = d1;
		d1 = (List<Order<Collection<RobotCommandProxy>>>)  ((RobotAction)action).postprocess(d1);
		this.data =d1;
		d1 =  (List<Order<Collection<RobotCommandProxy>>>) ((RobotAction)action).finalize(d1);
		}
		
	}catch(Exception ex) {
		ex.printStackTrace();
	}
		this.data = d1;
		return d1;
	}
	
	
}
