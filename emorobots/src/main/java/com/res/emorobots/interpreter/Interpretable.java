package com.res.emorobots.interpreter;

public interface Interpretable<T extends Interpreter< Context,InterpretableItem>> {

	public T getInterpreter(InterpretableItem iItem);
	public InterpretableItem interpret(Context context,long index);


}
