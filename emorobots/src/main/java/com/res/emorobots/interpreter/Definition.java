package com.res.emorobots.interpreter;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

public class Definition<T> extends Sentence<Collection<Token>> {  
	

   T definitionvalue;
	String type;
	Long sequence = 0l;

	
    public T getDefinitionvalue() {
		return definitionvalue;
	}
	public void setDefinitionvalue(T definitionvalue) {
		this.definitionvalue = definitionvalue;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Long getSequence() {
		return sequence;
	}
	public void setSequence(Long sequence) {
		this.sequence = sequence;
	}
	


	
	
	
}
