package com.leonarden.tools.service;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.leonarden.tools.segment.SortedSegment;
import com.leonarden.tools.util.typedelay.TypeDelay;


public class SortUnit<T> implements Runnable, SortCriteria<T> {
   
	final static int SortFromNumberFilterBinary = 0;
    long  [] delayUnits = {50}; /* base delay unit : implemented as array to enable swiching */
	/*
	final static int SortFromNumberFilterDecimal = 1;
	*/
	final static Logger logger = Logger.getLogger(SortUnit.class.getCanonicalName());
    
    SortedSegment <T> segment ;
	T item;
    int sortType;
    int maxItems;
    boolean isMaxItemsReached;
    static int numItems = 0;
    TypeDelay<T> typeDelay;
    
    
    public SortUnit(){
    	
    }
    	
	public SortUnit( SortedSegment<T> segment, T item, TypeDelay<T> typeDelay, int maxItems,  int sortType){
	
		this.segment = segment;
		this.item = item;
		this.typeDelay = typeDelay;
		this.sortType = sortType;
       this.maxItems = maxItems;
       this.isMaxItemsReached = false;
       
	}
	
	public  void setSortedSegment(SortedSegment<T>  segment){
		this.segment = segment;
	}
	
	public long[] getDelayUnits() {
		return delayUnits;
	}

	public void setDelayUnits(long[] delayUnits) {
		this.delayUnits = delayUnits;
	}

	public SortedSegment<T> getSegment() {
		return segment;
	}

	public void setSegment(SortedSegment<T> segment) {
		this.segment = segment;
	}

	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}

	public int getSortType() {
		return sortType;
	}

	public void setSortType(int sortType) {
		this.sortType = sortType;
	}

	public int getMaxItems() {
		return maxItems;
	}

	public void setMaxItems(int maxItems) {
		this.maxItems = maxItems;
	}

	public boolean isMaxItemsReached() {
		return isMaxItemsReached;
	}

	public void setMaxItemsReached(boolean isMaxItemsReached) {
		this.isMaxItemsReached = isMaxItemsReached;
	}

	/**
	 * Need to compute delay, then push to segment
	 * 
	 * This basic implementation from (Integer,Long)  filter bytes ( sortType = 0 ) 
	 * 
	 * 
	 * @throws Exception
	 */
   public  void sort() throws Exception {
	
	   long  delay = 0;
	   try {
		   delay = typeDelay.computeDelay(this.sortType);
	
	   }catch(Exception ex){
		
		   ex.printStackTrace();
		   delay = 0;
	   
	   }
	
	Thread.sleep((delay) + this.delayUnits[0]);
		
	if(SortUnit.numItems > 0 ) {
	 	   
		   synchronized(this){
			   this.segment.addItem((T) item);
			  System.out.println( "Added item " + (T) item + " to segment ");
			   if(SortUnit.numItems > 0)
				   SortUnit.numItems--;
				   
	       	}
		   
	}	   
	
   
   }
 
	/**
	 * 
	 */
	public void run() {
		long start = 0, begin=0, end = 0;
		try{
		
		start = System.currentTimeMillis();
		
		System.out.print("Started job:  at "  + start);
		/* threads will be lauch sequentially find a way to wait all are started then execute processing */
	   /**@SEE */
		while(!this.isMaxItemsReached){
			synchronized(this){
				if(SortUnit.numItems < this.maxItems  )
					SortUnit.numItems++;
					else
					this.isMaxItemsReached = true;
				}
			Thread.sleep(this.delayUnits[0]); /**/
		}
		
		begin = System.currentTimeMillis() - start;
		System.out.print("Beginning job  after (ms)"  + begin);
		
		if(SortUnit.numItems>0)
				this.sort();
	
	
	}catch(Exception ex){
		ex.printStackTrace();
	}
	
	end = System.currentTimeMillis() - start;
	
	System.out.println( "End job after ( ms) " + end  );
	
	}
	
}
