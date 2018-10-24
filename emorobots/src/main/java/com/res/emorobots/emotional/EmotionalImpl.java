package com.res.emorobots.emotional;

import java.util.Collection;
import java.util.List;
import java.util.Stack;

import com.res.emorobots.command.Action;
import com.res.emorobots.command.RobotCommandProxy;
import com.res.emorobots.sentence.Order;
import com.res.emorobots.util.EmoRobotUtil;

public class EmotionalImpl implements 
	Emotional<Stack<Order>,Stack<Action<Stack<Order>>>> {

	Stack<Order> orders;
	Stack<Action<Stack<Order>>> actions;
	
	public EmotionalImpl() {}
	
	public EmotionalImpl(	Stack<Order>orders,Stack<Action<Stack<Order>>> actions) {
			this.orders =  orders;
			this.actions =  actions;
		
		}

	
	public Stack<Order> normalize(Stack<Order> d) {
		// TODO Auto-generated method stub
		return null;
	}

	public Stack<Order> evaluateOrders(Stack<Order> orders) {
		// TODO Auto-generated method stub
		return null;
	}

	public Stack<Action<Stack<Order>>> evaluateActions(Stack<Action<Stack<Order>>> actions) {
		// TODO Auto-generated method stub
		return null;
	}

	public Stack<Order> initalize(Stack<Order> d) {
		// TODO Auto-generated method stub
		return null;
	}

	public Stack<Order> finalize(Stack<Order> d) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
