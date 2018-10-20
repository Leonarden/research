package com.leonarden.tools.service;

import com.leonarden.tools.segment.SortedSegment;
import com.leonarden.tools.util.typedelay.TypeDelay;

public class LongSortUnit extends SortUnit<Long> {

	public LongSortUnit(){
		
	}

    public LongSortUnit(SortedSegment<Long> segment, Long item, TypeDelay<Long> typeDelay,int maxItems,  int sortType){
    	super(segment,item,typeDelay, maxItems,sortType);
    }
	
    
}
