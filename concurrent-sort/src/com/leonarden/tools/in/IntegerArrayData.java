package com.leonarden.tools.in;

public class IntegerArrayData extends ArrayData<Integer> {

	
	public void createData(int length) throws Exception{
		this.data = new Integer[length];
		for(int i=0; i<length;i++){
			
			this.data[i] = new Integer(((int)( Math.random()* 100) +1));
		
		}
	
	
	
	
	}




}
