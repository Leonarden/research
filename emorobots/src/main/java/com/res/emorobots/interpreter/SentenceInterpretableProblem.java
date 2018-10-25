package com.res.emorobots.interpreter;

import java.util.Collection;
import java.util.List;

public class SentenceInterpretableProblem extends Problem<Definition, SentencesSolution>{
	
	Definition definition;
	SentencesSolution solution; 
	
	public SentenceInterpretableProblem() {
		
	}
	public SentenceInterpretableProblem(Long id,Definition def) {
		super(id,def);
		// TODO Auto-generated constructor stub
	}

	public Definition getDefinition() {
		return definition;
	}
	public void setDefinition(Definition definition) {
		this.definition = definition;
	}
	public SentencesSolution getSolution() {
		return solution;
	}
	public void setSolution(SentencesSolution solution) {
		this.solution = solution;
	}
	
	
	

}
