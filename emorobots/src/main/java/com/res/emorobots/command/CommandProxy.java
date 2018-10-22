package com.res.emorobots.command;

import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public class CommandProxy<T1 extends Collection<Action<T>>, T extends Collection<?>> implements Executable<T>, Serializable {
    String cmdName = null;
    List<String> classNames;
   
	Command<T1,T> command = null;
	public CommandProxy(String cname, List<String> anames) {
		this.classNames = classNames;
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
		for(String actn: classNames) {
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
	
}
