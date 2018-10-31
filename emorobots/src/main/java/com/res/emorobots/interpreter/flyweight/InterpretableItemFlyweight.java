package com.res.emorobots.interpreter.flyweight;

import java.util.Set;

import com.res.emorobots.interpreter.InterpretableItem;

public class InterpretableItemFlyweight<T, T1 extends InterpretableItem<T>> {

 T1 flyweight = null;

 
 public  T1 getFlyweight(T key) {
	 return flyweight;
 }
	
 public void setFlyweight(T1 f) {
	 this.flyweight = f;
 }
	
 	
	
	
	
}
