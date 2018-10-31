package com.res.emorobots.interpreter;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class OrderSolution<T> extends Solution<List<Map<String,List<Double>>>,Definition<Map<Long,Sentence<Collection<Token>>>>> {

	T solutionprocessed;

	
	public T getSolutionprocessed() {
		return solutionprocessed;
	}

	public void setSolutionprocessed(T solutionprocessed) {
		this.solutionprocessed = solutionprocessed;
	}

	@Override
	public List<Map<String, List<Double>>> getValue() {
		// TODO Auto-generated method stub
		return super.getValue();
	}

	@Override
	public void setValue(List<Map<String, List<Double>>> value) {
		// TODO Auto-generated method stub
		super.setValue(value);
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return super.getType();
	}

	@Override
	public void setType(String type) {
		// TODO Auto-generated method stub
		super.setType(type);
	}

	@Override
	public Definition<Map<Long, Sentence<Collection<Token>>>> getDefinition() {
		// TODO Auto-generated method stub
		return super.getDefinition();
	}

	@Override
	public void setDefinition(Definition<Map<Long, Sentence<Collection<Token>>>> definition) {
		// TODO Auto-generated method stub
		super.setDefinition(definition);
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
