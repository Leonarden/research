package com.res.emorobots.activity.action;

import com.res.emorobots.interpreter.Problem;

public interface ActionRequest<T1 extends Action,T extends Problem<Definition, Solution>> {

	T1 actionRequest(T problem, Action blockingAction);
	
	
}
