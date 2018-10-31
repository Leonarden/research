package com.res.emorobots.interpreter.builder;

import org.springframework.data.repository.CrudRepository;

import com.res.emorobots.interpreter.InterpretableItem;

public class InterpretableItemBuilder<T, T1 extends InterpretableItem,T2 extends CrudRepository> {
	T params;
	T1 resultpart;
	T2 repository;
	
	
	public void buildPart() throws Exception {
		
	}
	
	public T1 getResultpart() {
		return null;
	}

	public T getParams() {
		return params;
	}

	public void setParams(T params) {
		this.params = params;
	}

	public T2 getRepository() {
		return repository;
	}

	public void setRepository(T2 repository) {
		this.repository = repository;
	}

	public void setResultpart(T1 resultpart) {
		this.resultpart = resultpart;
	} 
	
	
	

}
