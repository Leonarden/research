package com.res.emorobots.observer;

import java.util.Map;

public class ObserverStatus {

	static Map<Integer,String> sysstat = null;
	
	public ObserverStatus() {
		   sysstat.put(0,"VERY CALM");
		   sysstat.put(1,"CALM");
		   sysstat.put(2,"AVERAGE");
		   sysstat.put(3,"BIT STRESSED");
		   sysstat.put(4,"STRESSED");
		   sysstat.put(5,"OVERFLOWN");
		   
	}
	
  public 	static Map<Integer,String> getInstance(){
		return ObserverStatus.sysstat;
	}

	public static Integer getStatusLen() {
		return sysstat.size();
	}

}
