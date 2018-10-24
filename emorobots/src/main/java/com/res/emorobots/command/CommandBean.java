package com.res.emorobots.command;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;

public class CommandBean{

	Long type = 0l;
	Map<Long,ActionBean> actions = null;
	String className = "";
	CommandProxy command;

	
	public long getType() {
		return type;
	}
	public void setType(long type) {
		this.type = type;
	}
	public Map<Long, ActionBean> getActions() {
		return actions;
	}
	public void setActions(Map<Long, ActionBean> actions) {
		this.actions = actions;
	}
	public void setType(Long type) {
		this.type = type;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	
	
	
	
	
	
}
