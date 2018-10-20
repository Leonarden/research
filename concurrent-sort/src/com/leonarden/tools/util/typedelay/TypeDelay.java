package com.leonarden.tools.util.typedelay;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class TypeDelay<T> {
    
	Logger logger = Logger.getLogger(TypeDelay.class.getCanonicalName());
	
	T item;
   /* this will be unit  of ms used for compute item delay */
    long delayUnit;
    
    public TypeDelay(T item, long delayUnit){
    	this.item = item;
    	this.delayUnit = delayUnit;
    }
    
    public void setItem(T item){
    	this.item = item;
    }
    public T getItem(){
    	return this.item;
    }
    
  public   abstract long computeDelay(int modelay) throws Exception;


  public long byteBufferDelay( ByteBuffer buffer, int byteSize, int modelay) throws Exception {
	  ByteBuffer bb = buffer;
	  byte[] arr = null;
	  int i;
	  long delay = 0;
	  long  dtemp = 0;
	  try{
			ByteOrder byteOrder = bb.order();	
		   arr = bb.array();
	    	if(byteOrder.equals(ByteOrder.LITTLE_ENDIAN))
	    		for(i=0;i<arr.length; i++){
	    	     if(arr[i]!=0){
	    			dtemp =  byteDelay(arr[i], byteSize, modelay);		
	    		    delay +=(dtemp>0?dtemp:0);
	    	     }
	    	   }
	    	else
	    		for(i=arr.length-1;i>=0; i--){
	    			 if(arr[i]!=0){
	    				 dtemp =  byteDelay(arr[i], byteSize, modelay);
	    				 delay +=(dtemp>0?dtemp:0);
	    			 }
	    		}  
		  
	  }catch(Exception ex){
		  logger.log(Level.ALL,ex.getMessage());
		  throw new Exception(" byteBufferDelay ERROR", ex);
	  }

	  return delay;
	  
  }
/**
 * 
 * @param b
 * @param byteSize
 * @param mode: 0  multiply delayUnit, 1 add delay unit
 * @return
 */
public long byteDelay(byte b, int byteSize, int mode){
	long delay = 0;
	byte bunit = 1;
	byte result = 0;
	for(int i=0; i<byteSize;i++){
	   result = b;   result &= bunit;
		delay += (mode==0?(result*this.delayUnit):(result+this.delayUnit));
		bunit <<=1;
	}
	
	return delay;
	
}
  
  
}
