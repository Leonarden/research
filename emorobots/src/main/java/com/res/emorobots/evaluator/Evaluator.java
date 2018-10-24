package com.res.emorobots.evaluator;

import java.util.Collection;
import java.util.List;
import java.util.Stack;

import com.res.emorobots.command.Action;
import com.res.emorobots.command.RobotCommandProxy;
import com.res.emorobots.sentence.Order;

public class Evaluator implements Evaluable<Stack<Action<Collection<Order<Collection<RobotCommandProxy>>>>>,Stack<Order<Collection<RobotCommandProxy>>>> {

	public List<EvalResult> evaluateOrders(Long actionType, Stack<Order<Collection<RobotCommandProxy>>> orders) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<EvalResult> evaluate(Object o) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<EvalResult> evaluateActions(Long actionType,
			Stack<Action<Collection<Order<Collection<RobotCommandProxy>>>>> actions) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
}
