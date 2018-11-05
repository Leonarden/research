package com.res.emorobots.interpreter.builder;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import com.res.emorobots.repository.WordRepository;
import com.res.emorobots.repository.SentenceRepository;
import com.res.emorobots.repository.SymbolRepository;

import com.res.emorobots.interpreter.InterpretableItem;
import com.res.emorobots.interpreter.Token;

public class TokenBuilder<T,T1> extends InterpretableItemBuilder<List<String>,Token,CrudRepository<T1,Serializable>> {

	T type;
	T1 entity;

	@Override
	public void buildPart() throws Exception {
		// TODO Auto-generated method stub
		super.buildPart();
	}

	@Override
	public Token getResultpart() {
		// TODO Auto-generated method stub
		return super.getResultpart();
	}

	@Override
	public List<String> getParams() {
		// TODO Auto-generated method stub
		return super.getParams();
	}

	@Override
	public void setParams(List<String> params) {
		// TODO Auto-generated method stub
		super.setParams(params);
	}

	@Override
	public CrudRepository<T1, Serializable> getRepository() {
		// TODO Auto-generated method stub
		return super.getRepository();
	}

	@Override
	public void setRepository(CrudRepository<T1, Serializable> repository) {
		// TODO Auto-generated method stub
		super.setRepository(repository);
	}

	@Override
	public void setResultpart(Token resultpart) {
		// TODO Auto-generated method stub
		super.setResultpart(resultpart);
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

	public T1 getEntity() {
		return entity;
	}

	public void setEntity(T1 entity) {
		this.entity = entity;
	}
	
	
	
	
	
	
	
	
	
	
}
