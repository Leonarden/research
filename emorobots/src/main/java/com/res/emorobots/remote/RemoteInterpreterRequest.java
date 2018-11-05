package com.res.emorobots.remote;

import java.util.Collection;
import java.util.Map;

import com.res.emorobots.activity.action.Action;
import com.res.emorobots.interpreter.Definition;
import com.res.emorobots.interpreter.Interpreter;
import com.res.emorobots.interpreter.Problem;
import com.res.emorobots.interpreter.Sentence;
import com.res.emorobots.interpreter.Solution;
import com.res.emorobots.interpreter.Token;
import com.res.emorobots.interpreter.definition.DefinitionInterpreter;
import com.res.emorobots.interpreter.solution.SolutionInterpreter;

public class RemoteInterpreterRequest extends RemoteRequest implements InterpreterRequest {

	public Interpreter interpreterRequest(Problem p, Action blocking) {
		// TODO Auto-generated method stub
		return null;
	}

//Action blocking can be null
	
	public DefinitionInterpreter definitionInterpreterRequest(Problem p, Action blocking) {
		// TODO Auto-generated method stub
		return null;
	}

//Action blocking can be null
	
	public SolutionInterpreter solutionInterpreterRequest(Problem p, Action blocking) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
