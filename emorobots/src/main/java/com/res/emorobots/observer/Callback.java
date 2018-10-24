package com.res.emorobots.observer;

import java.util.Collection;
import java.util.List;

import com.res.emorobots.command.RobotCommandProxy;
import com.res.emorobots.interpreter.OrderProxy;
import com.res.emorobots.sentence.Order;

public interface Callback<T extends Collection<OrderProxy>> {

	public void callback();
	public T callback(T o);
	
}
