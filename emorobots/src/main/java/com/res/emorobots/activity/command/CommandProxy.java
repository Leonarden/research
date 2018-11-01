package com.res.emorobots.activity.command;

import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import com.res.emorobots.sentence.Order;

public class CommandProxy<T1 extends Collection<Action<T>>, T extends Collection<Order>> implements Serializable {
    String cmdName = null;
    List<ActionBean> actionBeans;
    T data;
    T1 actions;
	Command<T1,T> command = null;
	
	public CommandProxy(String cname, List<ActionBean> abeans) {
		this.actionBeans = abeans;
		this.cmdName = cname;
		
		
		
	}
	public T execute() {
		T data = null;
		T1 actions = null;
		List<RobotCommandProxy> cmds = null;
		List<RobotAction> actlist = null;
		Class[] type = { Collection.class };
		Object[] obj = { this};
		Constructor<?> cons = null;
	try {
		//actions
		for(ActionBean acb: actionBeans) {
			String actn = acb.getClassname();
			Long atype = acb.getType();
			Class<?> actclass = Class.forName(actn);
			 cons = actclass.getConstructor(type);
		    RobotAction a = (RobotAction) cons.newInstance(obj);
		    actlist.add(a);
			}
		//command
		Class<?> cmdclass = Class.forName(cmdName);
		cons = cmdclass.getConstructor(type);
		obj[0] = actlist; obj[1] = this;
		command = (Command<T1,T>) cons.newInstance(obj);
	
		data = command.execute();
		
	}catch(Exception ex) {
	    ex.printStackTrace();	
	}
		
		return data;
		
	}
	
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public T1 getActions() {
		return actions;
	}
	public void setActions(T1 actions) {
		this.actions = actions;
	}

	
}
