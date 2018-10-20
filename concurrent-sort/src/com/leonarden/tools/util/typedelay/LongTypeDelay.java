package com.leonarden.tools.util.typedelay;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.logging.Level;

public class LongTypeDelay extends TypeDelay<Long> {
    
	public  LongTypeDelay(Long item, long delayUnit){
		super(item, delayUnit);
	}
	
    public  long computeDelay(int modelay) throws Exception{
    	ByteBuffer bb = null;
    	long delay = 0;
    	int byteSize;
    	try{
    		bb	= ByteBuffer.allocate(item.BYTES);
    		bb.putLong(item);
    		byteSize = Math.abs(item.BYTES/Byte.SIZE);
    	
    		delay = byteBufferDelay(bb, byteSize,modelay);
    			
    	}catch(Exception ex){
    		logger.log(Level.ALL,"computeDelay ERROR");
    	
    		throw new Exception (ex);
    	}
    	
    	
    	
    	return delay;
    
    }


}
