package com.res.emorobots.interpreter;

public class InterpretableItem<T> implements Interpretable<Interpreter< Context,InterpretableItem>>{
T value;
Interpreter <Context, InterpretableItem> interpreter;

	
	@Override
	public Interpreter<Context, InterpretableItem> getInterpreter(InterpretableItem iItem) {
		// TODO Auto-generated method stub
		return null;
	}
   public void setIntepreter(Interpreter<Context,InterpretableItem> i) {
	   this.interpreter = i;
   }
	
	@Override
	public InterpretableItem interpret(Context context, long index) {
		// TODO Auto-generated method stub
		return null;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	
	
	

}
