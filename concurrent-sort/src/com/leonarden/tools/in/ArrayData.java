package com.leonarden.tools.in;

import java.io.Serializable;

public class ArrayData<T> implements Serializable {

	T []   data;
	
	
	ArrayData(){
		
	}
	
	public void setData(T[] data){
		this.data = data;
	}
	
	public T[] getData(){
		return data;
	}
	
}
