package com.res.emorobots.interpreter.builder;

import com.res.emorobots.jpa.entity.Sentence;
import com.res.emorobots.jpa.entity.Symbol;
import com.res.emorobots.jpa.entity.Word;

public class InterpretableItemBuilderFactory {
	
	
	public static InterpretableItemBuilder  getInstance(String type) {
		
		InterpretableItemBuilder builder= null;
	
		if("word".equals(type)) {
			
				builder = new TokenBuilder<Word>();
			
		}if("symbol".equals(type)) {
	
			builder = new TokenBuilder<Symbol>();
			
			
		}
		
		
		if("sentence".equals(type)) {
		
			builder = new TokenBuilder<Sentence>();
			
			
		}
		
		
		return builder;
		
		
		
	}
	
	
	
	
	
	

}
