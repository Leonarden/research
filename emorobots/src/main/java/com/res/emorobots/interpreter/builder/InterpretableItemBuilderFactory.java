package com.res.emorobots.interpreter.builder;

import com.res.emorobots.jpa.entity.Sentence;
import com.res.emorobots.jpa.entity.Symbol;
import com.res.emorobots.jpa.entity.Word;


public class InterpretableItemBuilderFactory {
	
	
	public static InterpretableItemBuilder  getInstance(String type) {
		
		InterpretableItemBuilder builder= null;
	
		if("word".equals(type)) {
			
				builder = new TokenBuilder<com.res.emorobots.interpreter.Word,Word>();
			
		}if("symbol".equals(type)) {
	
			builder = new TokenBuilder<com.res.emorobots.interpreter.Symbol,Symbol>();
			
			
		}
		
		
		if("sentence".equals(type)) {
		
			builder = new TokenBuilder<com.res.emorobots.interpreter.Sentence,Sentence>();
			
			
		}
		
		
		return builder;
		
		
		
	}
	
	
	
	
	
	

}
