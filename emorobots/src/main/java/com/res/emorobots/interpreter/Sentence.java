package com.res.emorobots.interpreter;

import java.util.Collection;

public class Sentence<T extends Collection<Token>> extends InterpretableItem<String> {
	
	 T tokens = null;

	public T getTokens() {
		return tokens;
	}

	public void setTokens(T tokens) {
		this.tokens = tokens;
	}
   
	 
	
}
