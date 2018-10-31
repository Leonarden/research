package com.res.emorobots.interpreter;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

public class Definition<T extends Map> extends Token {  
	

	T value;
	String type;
	Long sequence = 0l;
	
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
	public Long getSequence() {
		return sequence;
	}
	public void setSequence(Long sequence) {
		this.sequence = sequence;
	}
	


	
	
	
}
