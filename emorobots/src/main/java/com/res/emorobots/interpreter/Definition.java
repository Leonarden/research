package com.res.emorobots.interpreter;

public class Definition<T>  {  //Different definitions MUST extend from different Type of sentences<value,interpretation>

	T value;
	String type;
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
	


}
