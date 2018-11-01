package com.res.emorobots.interpreter.flyweight;

import java.util.Arrays;

import org.springframework.data.repository.CrudRepository;

import com.res.emorobots.interpreter.Token;
import com.res.emorobots.interpreter.Word;
import com.res.emorobots.interpreter.builder.TokenDirector;
import com.res.emorobots.repository.WordRepository;

public class WordFlyweight  extends InterpretableItemFlyweight<String, Word> {

	WordRepository crud;
	
	public WordFlyweight() {
		
		try {
			// set crud
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	
	@Override
	public Word getFlyweight(String key) {
	
		TokenDirector<Word,com.res.emorobots.jpa.entity.Word> director = new TokenDirector<Word,com.res.emorobots.jpa.entity.Word>();
	try {	
		director.setParams(Arrays.asList(key));
		 director.build();
			
				
				this.flyweight = (Word) director.getResult();
			
	}catch(Exception ex) {
		ex.printStackTrace();
	}
		
	 return null;
	
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

	
	
	
}
