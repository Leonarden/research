package com.res.emorobots.stream;

import java.io.ObjectInputStream;
import java.util.Collection;

import com.res.emorobots.command.RobotCommandProxy;
import com.res.emorobots.sentence.Order;

public class OrdersInputStream<T extends Collection<Order<Collection<RobotCommandProxy>>>> {
	private Order<Collection<RobotCommandProxy>> order;
	private T Orders;
	private ObjectInputStream ois;
	public OrdersInputStream(ObjectInputStream ois) {
		this.ois = ois;
	}
	public Order<Collection<RobotCommandProxy>> readOrder() throws Exception
	{
		Order<Collection<RobotCommandProxy>> o = null;
		try {
			Object obj = this.ois.readObject();
			if(obj instanceof Order)
				o =(Order<Collection<RobotCommandProxy>>) obj;
			else
				throw new Exception("Incorrect object not a Order");
			
		}catch(Exception ex) {
			throw new Exception(ex);
		}
		return o;
	}
	
	public Collection<Order<Collection<RobotCommandProxy>>> readOrders() throws Exception
	{
		Collection<Order<Collection<RobotCommandProxy>>> ords = null;
		try {
			Object obj = this.ois.readObject();
			if(obj instanceof Collection<?>)
				ords =(Collection<Order<Collection<RobotCommandProxy>>>) obj;
			else
				throw new Exception("Incorrect object not a Collection<Order>");
			
		}catch(Exception ex) {
			throw new Exception(ex);
		}
		
		return ords;
	}
	
	
}
