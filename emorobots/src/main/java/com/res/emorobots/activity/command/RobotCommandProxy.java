package com.res.emorobots.activity.command;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Queue;

import com.res.emorobots.sentence.Order;

public class RobotCommandProxy  extends CommandProxy<Queue<Action<List<Order<Collection<RobotCommandProxy>>>>>, List<Order<Collection<RobotCommandProxy>>>> implements Executable<List<Order<Collection<RobotCommandProxy>>>>, Serializable 
{

	public RobotCommandProxy(String cname, List<ActionBean> anames) {
		super( cname, anames);
		// TODO Auto-generated constructor stub
	}

	
	
	
	
	
}
