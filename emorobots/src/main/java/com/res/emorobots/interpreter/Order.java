package com.res.emorobots.interpreter;

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

import com.res.emorobots.command.ActionBean;
import com.res.emorobots.command.CommandBean;
import com.res.emorobots.command.CommandProxy;
import com.res.emorobots.command.RobotAction;
import com.res.emorobots.command.RobotCommand;
import com.res.emorobots.command.RobotCommandProxy;

public class Order extends Sentence<String,>> {

	private Queue<CommandProxy> commandproxies = null;
    private Integer currentStatus = 1;	
	
	public Order() {	}
	
	public Order(String value) {
	 this.value = value;
   }

	public Order(String value, Map<Long,CommandBean> cmdbeans ) {
		
		this.value = value;
		
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


public Integer getOrderStatus() {
	return this.currentStatus;
}




}
