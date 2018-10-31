package com.res.emorobots.interpreter;

import java.util.Collection;
import java.util.Map;


public class Solution<T,T1 extends Definition<Map<Long,Sentence<Collection<Token>>>>> extends InterpretableItem<T> {

	T value;
	String type;
	T1 definition;
	
	public T getValue() {
		return value;
	}
	public void setValue(T value) {
		this.value = value;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public T1 getDefinition() {
		return definition;
	}
	public void setDefinition(T1 definition) {
		this.definition = definition;
	}
	@Override
	public Interpreter<Context, InterpretableItem> getInterpreter(InterpretableItem iItem) {
		// TODO Auto-generated method stub
		return super.getInterpreter(iItem);
	}
	@Override
	public void setIntepreter(Interpreter<Context, InterpretableItem> i) {
		// TODO Auto-generated method stub
		super.setIntepreter(i);
	}
	@Override
	public InterpretableItem interpret(Context context, long index) {
		// TODO Auto-generated method stub
		return super.interpret(context, index);
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	
	
	
	
}
