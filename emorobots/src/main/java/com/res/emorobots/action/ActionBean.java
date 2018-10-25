package com.res.emorobots.action;

import java.io.Serializable;
import java.util.Collection;

public class ActionBean implements Serializable{
	Long type =0l;
	//Action<Collection<?>> action;
	String classname;
	
	public Long getType() {
		return type;
	}
	public void setType(Long type) {
		this.type = type;
	}
	public String getClassname() {
		return classname;
	}
	public void setClassname(String classname) {
		this.classname = classname;
	}
	
	
	
}
