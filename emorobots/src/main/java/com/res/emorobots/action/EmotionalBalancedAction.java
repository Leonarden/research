package com.res.emorobots.action;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

import com.res.emorobots.emotional.Emotional;
import com.res.emorobots.emotional.EmotionalImpl;
import com.res.emorobots.sentence.Order;
import com.res.emorobots.util.EmoRobotUtil;

public class EmotionalBalancedAction extends Action<Stack<Order>>
	implements Emotional<Stack<Order>,Stack<Action<Stack<Order>>>> {

	Stack<Action<Stack<Order>>> actions;
	Emotional emo = null;
	Integer mode = 0;

	public EmotionalBalancedAction() {
		
	}

public EmotionalBalancedAction(Long type,Integer mode,Stack<Order> d,Stack<Action<Stack<Order>>> actions) {
	super(type,d);
	this.mode = mode;

	this.actions = (Stack<Action<Stack<Order>>>) actions;
	
	emo = new EmotionalImpl(d,this.actions);

}

public EmotionalBalancedAction(Long type) {
	this.type = type;
}

public EmotionalBalancedAction(Stack<Order> d) {
	this.data = d;
}


	public Collection<?> initalize(Collection<?> d) {
		// TODO Auto-generated method stub
		return null;
	}

	public Collection<?> finalize(Collection<?> d) {
		// TODO Auto-generated method stub
		return null;
	}


	public Stack<Stack<Order>> evaluateOrders(
			Stack<Stack<Order>> orders) {
		// TODO Auto-generated method stub
		return null;
	}

	public Stack<Action<Stack<Order>> evaluateActions(
			Stack<Action<Stack<Order>> actions) {
		Stack<Action<Stack<Order>> acts = null;
		int msize = actions.size() * actions.size();
		try {
			int itr = 0;
			boolean done = false;
			Iterator<Action<Stack<Order>> it = actions.iterator();			
		
			while(itr<msize&& !done) {
				 if(!(it.hasNext())) {
					   it  = actions.iterator();
					   itr++;
				   }
				Action<Stack<Order> a = it.next();
			  
				acts.push(a);	
			acts =(Stack<Action<Stack<Order>>) emo.evaluateActions((Collection<Action<Stack<Order>>) acts);
			if(balanced(this.mode,acts)) {
				this.actions = acts;
				done = true;
		    }
		   //else if()
		
			}
		
			if(!done)
				throw new Exception("No solution for the action combination");
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return acts;
	
		}

	/*
	 * check if obtained evaluation of actions is consistent with the result
	 * int mode: 0 strict = 100%, ...
	 */
	
	boolean balanced(int mode, Stack<Action<Stack<Order>> actions) {
		boolean isbalanced =false;
		if(mode==0)
			return (actions.size()==this.actions.size());
		//if(mode==1)...
		return isbalanced;
	}
	
}
