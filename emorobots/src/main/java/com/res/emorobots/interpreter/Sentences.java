package com.res.emorobots.interpreter;

import java.util.Collection;
import java.util.Map;

public class Sentences<T extends Map> extends InterpretableItem<String> {

	T sentences;

	public T getSentences() {
		return sentences;
	}

	public void setSentences(T sentences) {
		this.sentences = sentences;
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
	public String getValue() {
		// TODO Auto-generated method stub
		return super.getValue();
	}

	@Override
	public void setValue(String value) {
		// TODO Auto-generated method stub
		super.setValue(value);
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
