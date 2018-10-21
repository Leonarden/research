package com.res.emorobots.data;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.res.emorobots.command.RobotAction;
import com.res.emorobots.command.RobotCommand;

public class Order {

	private Map<String,Object> verb;
	private Map<String,Object> complement;
	private List<RobotCommand> commands;
	 
	public Order() {
		verb = new HashMap<String,Object>();
		complement = new HashMap<String,Object>();
		//default initialization
		
		List<Double> em1 = Arrays.asList(1d,1d,1d);
		verb.put("text", "");
		verb.put("weight", em1);
		
		complement.put("text", "");
		complement.put("weight", em1);
		commands = null;
		
	}
	

	public Order(String verbtext, String comptext, List<Double> vws, List<Double> cws,Map<String,String> commandsactionscssname) {
		verb = new HashMap<String,Object>();
		complement = new HashMap<String,Object>();
		
		verb.put("text", verbtext);
		verb.put("weight", vws);
		
		complement.put("text", comptext);
		complement.put("weight", cws);
		try {
		this.commands = generateCommands(commandsactionscssname);
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


public List<RobotCommand> getCommands() {
	return commands;
}


public void setCommands(List<RobotCommand> commands) {
	this.commands = commands;
}

List<RobotCommand> generateCommands(Map<String,String> commandsactionscssname) throws Exception {
	List<RobotCommand> cmds = null;
	List<RobotAction> acts = null;
	Class[] type = { List.class };
	Object[] obj = { this};
	for(String cname: commandsactionscssname.keySet()) {
	    String aname = commandsactionscssname.get(cname);
		Class<?> actclass = Class.forName(aname);
		Constructor<?> cons = actclass.getConstructor(type);
	    RobotAction a = (RobotAction) cons.newInstance(obj);
		obj = new Object[2]; obj[0] = this; obj[1] = a;
		Class<?> cmdclass = Class.forName(cname);
		 cons = cmdclass.getConstructor(type);
		 RobotCommand c = (RobotCommand) cons.newInstance(obj);
			
		 cmds.add( c);
	}
	
	return cmds;
}


}
