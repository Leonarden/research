package com.res.emorobot.streaming.action;

import com.res.emorobot.streaming.interpreter.Solution;

public interface ActionRequest<T extends Action,T1 extends Solution> {

	T actionRequest(T1 currentSolution);
	
	
}
