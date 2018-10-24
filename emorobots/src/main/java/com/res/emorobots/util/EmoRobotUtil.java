package com.res.emorobots.util;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Stack;

import com.res.emorobots.command.Action;
import com.res.emorobots.command.RobotCommandProxy;
import com.res.emorobots.sentence.Order;

public  class EmoRobotUtil {

public static 	Stack<Order> ordToStack(Collection<Order> os) {
	
	Stack<Order> s = new Stack<Order>();
   for(Order ord:os)
	   s.add(ord);
	return s;
}



public static 	Queue<Action<Collection<Order>>> actToQueue(Collection<Action<Collection<Order>>> as) {
	
	Queue<Action<Collection<Order>>> s = new PriorityQueue<Action<Collection<Order>>>();
    for(Action<Collection<Order>> act:as )
    	s.add(act);
	return s;
}

public static List<Order> ordToList(
		Collection<Order> os) {
	List<Order> s = new ArrayList<Order>();
	   for(Order ord:os)
		   s.add(ord);
		return s;
}

public static List<Action<Collection<Order>>> actToList(
		Queue<Action<Collection<Order>>> as) {
	List<Action<Collection<Order>>> s = new ArrayList<Action<Collection<Order>>>();
    for(Action<Collection<Order>> act:as )
    	s.add(act);
	
    return s;
}

public Action<Collection<Order>> getRandomAction(Queue<Action<Collection<Order>>> aq) {
	List<Action<Collection<Order>>> lst = this.actToList(aq);
	Action<Collection<Order>> a1 = lst.get(0); 
	Action<Collection<Order>> a = null;
	do{
	Collections.shuffle(lst);
     a = lst.get(0);
	} while(a1.equals(a));

	return a;
}

}





