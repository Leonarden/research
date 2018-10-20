package com.leonarden.tools.test;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import com.leonarden.tools.in.IntegerArrayData;
import com.leonarden.tools.segment.SortedSegment;
import com.leonarden.tools.service.SortArrayService;

public class MainTest {

	
	public static void main(String[] args) {

		int LENGTH = 5;
		long start=0, begin=0, end=0;
		int COMPUTEDELAYMODE = 0;
		long[] delayUnits = {10};
		IntegerArrayData input = new IntegerArrayData();
		
		ExecutorService launcher = null;
		
		 List<Integer> items =  new LinkedList<Integer>();
		//items =  Collections.synchronizedSortedSet(items);
		
		int INCREASINGMODE = 0;
		
		try{
			input.createData(LENGTH);	    
		}catch(Exception ex){
			ex.printStackTrace();
		}
		
		
		SortedSegment<Integer> segment = new SortedSegment<Integer>(items, INCREASINGMODE);
		
		try{
			
			SortArrayService<Integer> service = new SortArrayService<Integer>(segment, input.getData(), COMPUTEDELAYMODE,delayUnits);
		
			      ExecutorService executorService = service.getExecutorService();
		
		    		 launcher = Executors.newFixedThreadPool(1);
		
					start = System.currentTimeMillis();
					
					launcher.execute(service);
					
					System.out.println("Starting main job   at : " + start);
				
					launcher.execute(service);
					
		
					end = System.currentTimeMillis() - start;
					
					System.out.println("Ending main job at (ms) " + end);
					
				
					while(!executorService.isShutdown()){
						Thread.sleep(200);
						executorService.shutdown();
					}
					
					segment = (SortedSegment<Integer>)service.getSegment();
					
				//	launcher.shutdown();
					
				displayIntegerSegment(segment);

					
		}catch(Exception ex ){
			ex.printStackTrace();
		
		}
		
		
	
	}
	

	static void displayIntegerSegment(SortedSegment<Integer> segment) {
		
		System.out.println("++++++++++++++++++++Output SortedSegment+++Start");
		for(int i = 0; i<  segment.getItems().size() ; i++){
			Integer e = (Integer) segment.getItems().get(i);
		   System.out.println("Element["+i+"] : " + e + " ,  ");
		}
		System.out.println("++++++++++++++++++++Output SortedSegment+++End");
	}


}
