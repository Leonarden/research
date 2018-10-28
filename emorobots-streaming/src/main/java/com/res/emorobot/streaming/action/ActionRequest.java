package com.res.emorobot.streaming.action;



public interface ActionRequest<T1 extends Action,T extends Problem> {

	T1 actionRequest(T problem, Action blockingAction);
	
	
}
