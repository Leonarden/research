package com.res.emorobots.action;

import java.util.Collection;
import java.util.List;

import com.res.emorobots.order.Order;


public class Action<T extends Collection<Order<Problem<Definition,Solution<Object>>>>> {
T data;
long type;

public Action() {
	
}

public Action(Long type,T d) {
	this.data = (T) d;
	this.type = type;
}

public Action(Long type) {
	this.type = type;
}

public Action(T d) {
	this.data = d;
}


public T preprocess(Collection<Order>  d) {
		return null;
	}
	public T process(Collection<Order> d1) {
		return null;
	}

	public T postprocess(Collection<Order>  d) {
		return null;
	}

}