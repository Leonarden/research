package com.res.emorobots.order;

import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;

import com.res.emorobots.command.Action;
import com.res.emorobots.command.ActionBean;
import com.res.emorobots.command.CommandBean;
import com.res.emorobots.command.CommandProxy;
import com.res.emorobots.command.RobotAction;
import com.res.emorobots.command.RobotCommandProxy;

public class OrderProxy<T,T1> implements Serializable{

	/**
	 * 
	 */
	Order  order = null;
	private Queue<CommandProxy> commandproxies;
	
	Map<Long,CommandBean> commandBeans = null;
	
	private T problem;  // problem must be of type interpretable Problem <T1 extends Solution> 
	private T1 solution;
	private String type;
	
	
	
	public OrderProxy(String type) {
		 this.type = type;
	   }
	
		
	
   public OrderProxy(String type,Map<Long,CommandBean> cmdbeans) {
	   try{
		      this.commandBeans = cmdbeans;
	          this.order = new Order(type,cmdbeans);
		    
	   }catch(Exception ex) {
		   ex.printStackTrace();
	   }
   }

public Order getOrder() {
	return order;
}

public void setOrder(Order order) {
	this.order = order;
}


public Queue<CommandProxy> getCommandproxies() {
	return commandproxies;
}

public void setCommandproxies(Queue<CommandProxy> commandproxies) {
	this.commandproxies = commandproxies;
}

public Map<Long, CommandBean> getCommandBeans() {
	return commandBeans;
}

public void setCommandBeans(Map<Long, CommandBean> commandBeans) {
	this.commandBeans = commandBeans;
}	

   
public Integer getStatus() {
	return this.order.getStatus();
}



public T getProblem() {
	return problem;
}



public void setProblem(T problem) {
	this.problem = problem;
}



public T1 getSolution() {
	return solution;
}



public void setSolution(T1 solution) {
	this.solution = solution;
}



public String getType() {
	return type;
}



public void setType(String type) {
	this.type = type;
}
   



}
