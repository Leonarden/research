package com.res.emorobots.observer;

import java.util.Collection;
import java.util.List;
import java.util.Stack;

import com.res.emorobots.command.RobotCommandProxy;
import com.res.emorobots.order.OrderProxy;


public interface RobotCallback extends Callback<Stack<OrderProxy<T, T1>>>{

	
}
