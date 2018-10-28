package com.res.emorobot.streaming.interpreter;

public interface InterpreterRequest<T extends Interpreter,T1 extends Solution> {

	T interpreterRequest(T1 currentSolution);
	
	
}
