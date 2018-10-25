package com.res.emorobots.interpreter;

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

public class OrderProxy implements Serializable{

	/**
	 * 
	 */
	Order  order = null;
	private Queue<CommandProxy> commandproxies;
	
	Map<Long,CommandBean> commandBeans = null;
	
   public OrderProxy(String value,Map<Long,CommandBean> cmdbeans) {
	   try{
		      this.commandBeans = cmdbeans;
	          this.order = new Order(value,cmdbeans);
		    
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

Map<String,Object> getInterpretation() {

	return this.order.getInterpretation();

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

   
public Integer getOrderStatus() {
	return this.order.getOrderStatus();
}
   

}
