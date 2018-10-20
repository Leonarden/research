package com.leonarden.tools.service;

import com.leonarden.tools.segment.SortedSegment;
import com.leonarden.tools.util.typedelay.TypeDelay;

public class IntegerSortUnit extends SortUnit<Integer> {

	public IntegerSortUnit(){
		
	}

    public IntegerSortUnit(SortedSegment<Integer> segment, Integer item,TypeDelay<Integer> typeDelay, int maxItems,  int sortType){
    	super(segment,item,typeDelay, maxItems,sortType);
    }
	
    
}
