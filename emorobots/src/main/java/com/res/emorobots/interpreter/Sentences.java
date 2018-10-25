package com.res.emorobots.interpreter;

import java.util.Collection;

public class Sentences<T1,T2>  implements Interpretable<T2> {

	T1 value;
	T2 interpretation = null; 
	Collection<Sentence<T1,T2>> sentences = null;

	   public T1 getValue() {
			return value;
		}

		public void setValue(T1 value) {
			this.value = value;
		}

		public T2 getInterpretation() {
			return interpretation;
		}

		public void setInterpretation(T2 interpretation) {
			this.interpretation = interpretation;
		}
		
	public T2 interpret() {
		// TODO Auto-generated method stub
		return null;
	}

	   
	   
	   


}
