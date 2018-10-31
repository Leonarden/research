package com.res.emorobots.interpreter.flyweight;

import java.util.Set;

import com.res.emorobots.interpreter.InterpretableItem;
import com.res.emorobots.interpreter.Token;


public class TokenFlyweightFactory extends IterpretableItemFlyweightFactory<String,Token> {

	@Override
	public Token getFlyweight(String key) throws Exception {
		// TODO Auto-generated method stub
		return super.getFlyweight(key);
	}

	@Override
	public String getKey() {
		// TODO Auto-generated method stub
		return super.getKey();
	}

	@Override
	public void setKey(String key) {
		// TODO Auto-generated method stub
		super.setKey(key);
	}

	@Override
	public InterpretableItemFlyweight<String, Token> getFlyweight() {
		// TODO Auto-generated method stub
		return super.getFlyweight();
	}

	@Override
	public void setFlyweight(InterpretableItemFlyweight<String, Token> flyweight) {
		// TODO Auto-generated method stub
		super.setFlyweight(flyweight);
	}

	@Override
	public Set<Token> getFlyweights() {
		// TODO Auto-generated method stub
		return super.getFlyweights();
	}

	@Override
	public void setFlyweights(Set<Token> flyweights) {
		// TODO Auto-generated method stub
		super.setFlyweights(flyweights);
	}

	@Override
	void addFlyweight(Token f) throws Exception {
		// TODO Auto-generated method stub
		super.addFlyweight(f);
	}

	@Override
	Token getFactoryStoredFlyweight(String key) throws Exception {
		// TODO Auto-generated method stub
		return super.getFactoryStoredFlyweight(key);
	}

	
	
	
	
	
}
