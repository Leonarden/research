package com.leonarden.tools.segment;

import java.io.Serializable;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSegment<T> implements Serializable {

	T first;
	T last;
	List<T> items;
	int criteria; /* 0: increasing , 1 : decreasing */
	
	
	public SortedSegment(List<T> items, int criteria){
		this.setItems(items); 
		this.criteria = criteria;
	}
	
	public SortedSegment(){
		items =  new  LinkedList<T>();
		criteria = 0; /* increasing */
	}
	
	/*
	*//**
	 * 
	 * @return SortedSegment union of this and input Min(first1,first2) to Max(last1,last2)
	 *//*
	public SortedSegment<T> union(SortedSegment<T> ss){
		SortedSegment<T> st = new SortedSegment();
		T ssf = (T) ss.getFirst();
		T ssl = (T) ss.getLast();
		T start, end; 
		
	}
	
	*//**
	 *   
	 * @return difference between this sortedsegment and input or null     this.first to Min(last1, first2)
	 * 
	 * 
	 *//*
	public SortedSegment<T> difference(SortedSegment<T> ss){
		
	}
     
	*//**
	 * @return SortedSegment intersection between this and input 
	 * stablish left segement and right segment Min(first1,first2)
	 * Min(last1, first2) to last2
	 *//*
   public SortedSegment<T> intersection(SortedSegment<T> ss){
	   
   }
*/
	public List<T> getItems() {
		return items;
	}

	public void setItems(List<T> items) {
		this.items = items;
	}

	public T getFirst() {
		return first;
	}

	public T getLast() {
		return last;
	}

	public int getCriteria() {
		return criteria;
	}

	public void setCriteria(int criteria) {
		this.criteria = criteria;
	}

	public void addItem(T item){
		long decfirst = -10000;
		if(this.first!=null)
			decfirst = Long.decode(this.first.toString());
		long declast = 100000;
		if(this.last!=null)
			declast = Long.decode(this.last.toString());
		
		long decitem = Long.decode(item.toString());
		if( decfirst > decitem)
			this.first = (T) item;
		else if(declast < decitem)
			this.last = (T)item;
	
		
		this.items.add((T) item);
	
	}
   
   
}

