package com.res.memento;

import java.util.List;

public class State<T> {

	private  List<T> states;
	
	
	public void add(T s){
		states.add(s);
	}
 
	public T removeLast(){
		int l = states.size();
		T s = states.get(l-1);
		states.remove(l-1);
		return s;
	}
	
	public void display() {
		for(T s:states){
			System.out.println("" + s);
		}
	}

	public Double distance() {
		Double s = new Double(0);
		for(T a:states)
			s = (Double) a;
		return s;
	}
}

