package com.res.emorobots.command;

import java.util.List;

import com.res.emorobots.data.Order;

public class RobotAction extends Action<List<Order>> implements RobotEmotional {

	public RobotAction(List<Order> d) {
		this.data = d;
	}
	public List<Order> initalize(List<Order> d) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Order> normalize(List<Order> d) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Order> finalize(List<Order> d) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Order> preprocess(List<Order> d) {
		// TODO Auto-generated method stub
		return super.preprocess(d);
	}

	@Override
	public List<Order> process(List<Order> d) {
		// TODO Auto-generated method stub
		return super.process(d);
	}

	@Override
	public List<Order> postprocess(List<Order> d) {
		// TODO Auto-generated method stub
		return super.postprocess(d);
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

	
}
