package com.res.emorobots.interpreter;

public class Problem<T extends Definition,T1 extends Solution<Object>> { //different problems must have concrete Defnintion and Solution Type
	
	//!! Need to define more characteristics of a problem
	Long id;
	
	T definition;
	Solution solution;
	String type;
	Integer status;
	
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
	public Solution getSolution() {
		return solution;
	}
	public void setSolution(Solution solution) {
		this.solution = solution;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}
	
	
	
	
	
	

}
