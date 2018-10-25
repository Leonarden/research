package com.res.emorobots.interpreter;

import java.util.Collection;

public class SentenceInterpretableProblem extends Problem<Collection<Sentences<Sentence,?>>, Collection<?>>{
	
	Collection<Sentences<Sentence,?>> definition;
	Collection<?> solution; 
	
	public SentenceInterpretableProblem() {
		
	}
	public SentenceInterpretableProblem(Collection<Sentences<Sentence, ?>> def) {
		super(def);
		// TODO Auto-generated constructor stub
	}

	public Collection<Sentences<Sentence, ?>> getDefinition() {
		return definition;
	}
	public void setDefinition(Collection<Sentences<Sentence,?>> definition) {
		this.definition = definition;
	}
	public Collection<?> getSolution() {
		return solution;
	}
	public void setSolution(Collection<?> solution) {
		this.solution = solution;
	}
	
	
	

}
