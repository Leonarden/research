package com.res.emorobots.activity.action;

import java.util.Collection;
import java.util.List;

import com.res.emorobots.activity.ActionActivity;
import com.res.emorobots.interpreter.Definition;
import com.res.emorobots.interpreter.Problem;
import com.res.emorobots.interpreter.Solution;
import com.res.emorobots.order.Order;


public class Action<T extends Collection<Order<Problem<Definition,Solution>>>> extends ActionActivity  implements Preparable{
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

	@Override
	public Collection initalize(Collection d) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection finalize(Collection d) {
		// TODO Auto-generated method stub
		return null;
	}

}
