package com.res.emorobots.emotional;

import java.util.Collection;
import java.util.List;
import java.util.Stack;

import com.res.emorobots.command.Action;
import com.res.emorobots.command.RobotCommandProxy;
import com.res.emorobots.sentence.Order;

public class EmotionalRobotImpl implements Emotional<Stack<Order>,Stack<Action<Stack<Order>>>>{
	 Stack<Order> data;
public EmotionalRobotImpl( Stack<Order>  d) {
	this.data = d;
}
	public List<Order> initalize(List<Order> d) {
		// TODO Auto-generated method stub
		return null;
	}


	public List<Order> finalize(List<Order> d) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public  Stack<Order> evaluateOrders(
			 Stack<Order> orders) {
		// TODO Auto-generated method stub
		return null;
	}
	public Stack<Action< Stack<Order>>> evaluateActions(
			Stack<Action< Stack<Order>>> actions) {
		// TODO Auto-generated method stub
		return null;
	}
	


}
