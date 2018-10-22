package com.res.emorobots.data;

import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.res.emorobots.command.RobotAction;
import com.res.emorobots.command.RobotCommand;
import com.res.emorobots.command.RobotCommandProxy;

public class Order<T extends Collection<RobotCommandProxy>> implements Serializable{

	private Map<String,Object> verb;
	private Map<String,Object> complement;
	private T commandproxies;
	private  Map<String,List<String>> commandsactionscssname;
	public Order() {
		verb = new HashMap<String,Object>();
		complement = new HashMap<String,Object>();
		//default initialization
		
		List<Double> em1 = Arrays.asList(1d,1d,1d);
		verb.put("text", "");
		verb.put("weight", em1);
		
		complement.put("text", "");
		complement.put("weight", em1);
		commandproxies = null;
		
	}
	

	public Order(String verbtext, String comptext, List<Double> vws, List<Double> cws,Map<String,List<String>> cacssname) {
		verb = new HashMap<String,Object>();
		complement = new HashMap<String,Object>();
		
		verb.put("text", verbtext);
		verb.put("weight", vws);
		
		complement.put("text", comptext);
		complement.put("weight", cws);
		commandsactionscssname = cacssname;
		try {
		this.commandproxies = generateCommandProxies(commandsactionscssname);
		}catch(Exception ex) {
			//Todo: Implement custom exceptions
		ex.printStackTrace();
		}
				
	}
	
	 public String getVerbText() {
		 return (String) verb.get("text");
	 }

	 public List<Double> getVerbWeight() {
		 
		 return (List<Double>) verb.get("weight");
	 }

	 public String getComplementText() {
		 return(String) complement.get("text");
	 }

	 public List<Double> getComplementWeight() {
		 return (List<Double>) complement.get("weight");

	 }

   public void setVerbText(String v) {
	   verb.put("text", v);
   }
	 
   public void setComplementWeight(List<Double> w) {
	   
	   complement.put("weight", w);
   }


public Map<String, Object> getVerb() {
	return verb;
}


public void setVerb(Map<String, Object> verb) {
	this.verb = verb;
}


public Map<String, Object> getComplement() {
	return complement;
}


public void setComplement(Map<String, Object> complement) {
	this.complement = complement;
}


public T getCommands() {
	return commandproxies;
}


public void setCommands(T cps) {
	this.commandproxies = cps;
}

public T generateCommandProxies(Map<String,List<String>> commandsactionscssname) throws Exception {
	T cmds = null;
	List<RobotAction> actlist = null;
	Class[] type = { String.class, List.class };
	Object[] obj = new Object[2];
	Constructor<?> cons = null;
	for(String cname: commandsactionscssname.keySet()) {
	    List<String> anames = commandsactionscssname.get(cname);
		  obj[0] = cname; obj[1] = anames;
		Class<?> cmdclass = Class.forName(cname);
		 cons = cmdclass.getConstructor(type);
		 RobotCommandProxy c = (RobotCommandProxy) cons.newInstance(obj);
			
		 cmds.add( c);
	}
	
	return cmds;
}



}
