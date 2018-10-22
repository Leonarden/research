package com.res.emorobots.command;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Queue;

import com.res.emorobots.data.Order;

public class RobotCommandProxy  extends CommandProxy<Queue<Action<List<Order>>>, List<Order>> implements Executable<List<Order>>, Serializable{

	public RobotCommandProxy(List<String> d,String cname, List<String> anames) {
		super( cname, anames);
		// TODO Auto-generated constructor stub
	}

	
}
