package com.leonarden.tools.service;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.leonarden.tools.segment.SortedSegment;
import com.leonarden.tools.util.typedelay.TypeDelay;
import com.leonarden.tools.util.typedelay.TypeDelayFactory;

public class SortArrayService<T>  implements Runnable{

	ExecutorService executorService;
	SortUnit<T> [] sortItems;
	T[] input;
	public  SortedSegment<T> segment;
	long[] delayUnits = {5};
	public SortArrayService( SortedSegment<T> segment,  T[] inputArray, int criteria,long[] delayUnits){
		this.segment = segment;
		input = inputArray;
		sortItems = new SortUnit [this.input.length];
		executorService = Executors.newFixedThreadPool(this.input.length);
		this.delayUnits = delayUnits;
		
	}
	
	public  void setSortedSegment(SortedSegment<T> segment){
		this.segment = segment;
	}
	
	
	/**
	 * Create all sortUnit 
	 * @return
	 * @throws Exception
	 */
	public void  prepare() throws Exception{
		TypeDelayFactory delayFactory = new TypeDelayFactory();
		
		for(int i=0; i< this.input.length;i++ ){
			TypeDelay<T> typeDelay = (TypeDelay<T>) delayFactory.getInstance(this.input[i], this.delayUnits[0]); 
			SortUnit<T> item = new SortUnit<T>(this.segment, this.input[i], typeDelay, this.input.length, this.segment.getCriteria());
			this.sortItems[i] = (SortUnit<T>) item;
		}
	}
	
	public void run()  {
	long start = 0, end =0;
	start = System.currentTimeMillis();
	
	System.out.println("SortArrayService start (ms)" + start);
		try{
			
		
			this.prepare();
			
		
		for(SortUnit<T> s: this.sortItems)	
			executorService.execute(s);
		
			
		
		}catch(Exception ex){
			
			ex.printStackTrace();
		
		}
	
		end = System.currentTimeMillis() - start;
		
		System.out.println("SortArrayService end (ms)" + end);
	

	    
	}
	
	public  SortedSegment<T> getSegment(){
		return this.segment;
	}

	public ExecutorService getExecutorService() {
		return executorService;
	}
	
	
	
}
