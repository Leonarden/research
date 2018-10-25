package com.res.emorobots.interpreter;

import java.io.Serializable;

public class ProblemProxy<T,T1,T2> implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	T problem;
	T1 definition;
	T2 solution;
	
	public ProblemProxy( ) {
		
	}
	
	public ProblemProxy(T1 def) {
		
	}
	
	public T1 getDefinition() {
		return definition;
	}
	public void setDefinition(T1 definition) {
		this.definition = definition;
	}
	public T2 getSolution() {
		return solution;
	}
	public void setSolution(T2 solution) {
		this.solution = solution;
	}
	
	
	
}
