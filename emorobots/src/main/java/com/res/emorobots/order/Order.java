package com.res.emorobots.order;

import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;

import com.res.emorobots.action.ActionBean;
import com.res.emorobots.command.CommandBean;
import com.res.emorobots.command.CommandProxy;
import com.res.emorobots.command.RobotAction;
import com.res.emorobots.command.RobotCommand;
import com.res.emorobots.command.RobotCommandProxy;
import com.res.emorobots.exception.OrderException;
import com.res.emorobots.interpreter.Definition;
import com.res.emorobots.interpreter.Problem;
import com.res.emorobots.interpreter.Solution;

public class Order<T extends Problem<Definition, Solution<Object>>>  {

	private Queue<CommandProxy> commandproxies = null;
    private Integer status = 9;	
	private T problem;  // problem must be of type interpretable Problem <T1 extends Solution> 

	private String type;
	
	public Order() {	}
	
	public Order(String type) {
	 this.type = type;
   }

	public Order(String type, Map<Long,CommandBean> cmdbeans ) {
		
		this.type = type;
		
		try {
		this.commandproxies = generateCommandProxies(cmdbeans);
		
		}catch(Exception ex) {
			//Todo: Implement custom exceptions
		ex.printStackTrace();
		}
				
	}
	
	


public Queue<CommandProxy> generateCommandProxies(Map<Long,CommandBean> cmdbeans) throws Exception {
	Queue<CommandProxy> cmds = null;
	List<RobotAction> actlist = null;
	Class[] type = { String.class, List.class };
	Object[] obj = new Object[2];
	Constructor<?> cons = null;
	for(Long key: cmdbeans.keySet()) {
	    CommandBean cmdb = cmdbeans.get(key);
		  obj[0] = cmdb.getClassName(); 
		  Map<Long,ActionBean> actbs = cmdb.getActions();
		  obj[1] = actbs;
		Class<?> cmdclass = Class.forName( cmdb.getClassName()); 
		 cons = cmdclass.getConstructor(type);
		 CommandProxy c = (CommandProxy) cons.newInstance(obj);
			
		 cmds.add((CommandProxy) c);
	}
	
	return cmds;
}

public Queue<CommandProxy> getCommandproxies() {
	return commandproxies;
}

public void setCommandproxies(Queue<CommandProxy> commandproxies) {
	this.commandproxies = commandproxies;
}


public Integer getStatus() {
	return this.status;
}

public T getProblem() {
	return problem;
}

public void setProblem(T problem) {
	this.problem = problem;
}

public Solution getSolution() {
	if(this.problem.getStatus()== 1) // problem solved
	return this.problem.getSolution();
 return null; //have to be a significative value CHANGE
}

public void setSolution(Solution solution) {
	if(this.problem.getStatus()!=1) // problem not solved
	 this.problem.setSolution(solution);
	//have to log this
}

public String getType() {
	return type;
}

public void setType(String type) {
	this.type = type;
}

public void setStatus(Integer status) {
	this.status = status;
}






}
