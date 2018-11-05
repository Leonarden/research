package com.res.emorobots.remote;

import java.util.Collection;
import java.util.Map;

import com.res.emorobots.activity.action.Action;
import com.res.emorobots.interpreter.Context;
import com.res.emorobots.interpreter.Definition;
import com.res.emorobots.interpreter.InterpretableItem;
import com.res.emorobots.interpreter.Interpreter;
import com.res.emorobots.interpreter.Problem;
import com.res.emorobots.interpreter.Sentence;
import com.res.emorobots.interpreter.Solution;
import com.res.emorobots.interpreter.Token;
import com.res.emorobots.order.Order;

public interface InterpreterRequest<T extends Interpreter<Context<InterpretableItem>, InterpretableItem<T>>,T1 extends Problem<Definition<Map<?, ?>>, Solution<T, Definition<Map<Long,Sentence<Collection<Token>>>>>>, 
			T2 extends Action<Collection<Order<Problem<Definition,Solution>>>>> {

	T interpreterRequest(T1 p,  T2 blocking);    /* we request for interpreter of a solution that blocks in blocking action */
	
	
}
