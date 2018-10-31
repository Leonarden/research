package com.res.emorobots.interpreter.builder;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import com.res.emorobots.interpreter.InterpretableItem;

public class InterpretableItemDirector<T, T1 extends InterpretableItem> {
	private T params;
	private InterpretableItemBuilder builder;
    private String type;
	 
	 public void build() throws Exception{
		
		if(type==null || "".equals(type))  throw new Exception("Unknown TYPE");
		if(params == null) throw new Exception("No PARAMS specified");
		builder = InterpretableItemBuilderFactory.getInstance(type);
		builder.setParams(params);
		builder.buildPart();
		
		
	}
	public InterpretableItem getResult(){
		
		return builder.getResultpart();
	
	}
	
	
	public void setParams(T p) {
		this.params = p;
	}
	public InterpretableItemBuilder getBuilder() {
		return builder;
	}
	public void setBuilder(InterpretableItemBuilder builder) {
		this.builder = builder;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public T getParams() {
		return params;
	}
	


}
