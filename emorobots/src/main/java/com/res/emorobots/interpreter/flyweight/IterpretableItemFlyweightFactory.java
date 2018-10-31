package com.res.emorobots.interpreter.flyweight;

import java.util.Set;

import com.res.emorobots.interpreter.InterpretableItem;

public class IterpretableItemFlyweightFactory<T,T1 extends InterpretableItem<T>> {

	private T key;
	private InterpretableItemFlyweight<T,T1> flyweight;
	private 	Set<T1> flyweights;
	
	
	public  T1 getFlyweight(T key) throws Exception{
	  T1 fly = null;
	  fly = getFactoryStoredFlyweight(key);
	  if(fly==null) {
		  fly = flyweight.getFlyweight(key);
		  if(fly==null) throw new Exception("Flyweight of key:" + key.toString() + "not found");
		  addFlyweight(fly);
	  }
	
	  return fly;
		
	}


	public T getKey() {
		return key;
	}


	public void setKey(T key) {
		this.key = key;
	}


	public InterpretableItemFlyweight<T, T1> getFlyweight() {
		return flyweight;
	}


	public void setFlyweight(InterpretableItemFlyweight<T, T1> flyweight) {
		this.flyweight = flyweight;
	}


	public Set<T1> getFlyweights() {
		return flyweights;
	}


	public void setFlyweights(Set<T1> flyweights) {
		this.flyweights = flyweights;
	}
	
	
	void addFlyweight(T1 f) throws Exception {
		this.flyweights.add(f);
	}
	

	T1 getFactoryStoredFlyweight(T key) throws Exception{
		T1 f = null;
		T v = null;
		for(T1 fly: this.flyweights) {
			v = (T) fly.getValue();
			if(v.equals(key)) {
				f = fly;
				break;
			}
			
		}
	
		return f;
		
	}


}
