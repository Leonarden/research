package com.res.emorobot.streaming.interpreter;

public interface InterpreterRequest<T extends Interpreter,T1 extends Problem, T2 extends Action> {

	T interpreterRequest(T1 p,  T2 blocking);    /* we request for interpreter of a solution that blocks in blocking action */
	
	
}
