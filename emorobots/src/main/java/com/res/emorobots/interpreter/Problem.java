package com.res.emorobots.interpreter;

public class Problem<T,T1> {
	
	//!! Need to define more characteristics of a problem
	Long id;
	
	T definition;
	T1 solution;
	
	
	public Problem() {
		
	}
	
	public Problem(Long id,T def) {
		
	}
	
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public T getDefinition() {
		return definition;
	}
	public void setDefinition(T definition) {
		this.definition = definition;
	}
	public T1 getSolution() {
		return solution;
	}
	public void setSolution(T1 solution) {
		this.solution = solution;
	}
	
	
	
	
	
	

}
