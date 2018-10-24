package com.res.emorobots.evaluator;

import java.util.Collection;
import java.util.List;

import com.res.emorobots.command.Action;
import com.res.emorobots.command.RobotCommandProxy;
import com.res.emorobots.sentence.Order;

public interface Evaluable<T1 extends Collection<Action<Collection<Order<Collection<RobotCommandProxy>>>>>,T extends Collection<Order<Collection<RobotCommandProxy>>>> {

	public List<EvalResult> evaluate(Object o);
	
	public List<EvalResult> evaluateOrders(Long actionType, T orders);
	
	public List<EvalResult> evaluateActions(Long actionType, T1 actions);
	
}
