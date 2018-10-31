package com.res.emorobots.interpreter.flyweight;

import java.util.Arrays;

import org.springframework.data.repository.CrudRepository;

import com.res.emorobots.interpreter.Symbol;
import com.res.emorobots.interpreter.Token;
import com.res.emorobots.interpreter.Word;
import com.res.emorobots.interpreter.builder.TokenDirector;


import com.res.emorobots.repository.SynonymRepository;


public class TokenFlyweight<T> extends InterpretableItemFlyweight<String,Token> {

	CrudRepository crud;
	T type;
	public TokenFlyweight() {
		
		try {
			if(! setDao())
				throw new Exception("TokenFlyweight, DAO not SET!!!");
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	
	@Override
	public Token getFlyweight(String key) throws Exception {
	
		TokenDirector director = new TokenDirector();
		
		director.setParams(Arrays.asList(key));
		 director.build();
			if( type instanceof Word) {
				
				this.flyweight = (Token) director.getResult();
			}
	
		
	
	
	}

	@Override
	public void setFlyweight(Token f) {
		// TODO Auto-generated method stub
		super.setFlyweight(f);
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

	
	boolean setDao() {
		boolean isSet = false;
		if( type instanceof Symbol) {
			crud = null; /* need of CrudImpl */
			isSet = true;
		}
		else if(this.type instanceof Word) {
			crud = null; /* need of CrudImpl */
			isSet = true;
		}
		else if(this.type instanceof Word) {
			crud = null; /* need of CrudImpl */
			isSet = true;
		}
		
		return isSet;
		
	}

	
	
	
}
