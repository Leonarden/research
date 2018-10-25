package com.res.emorobots.interpreter;

import java.io.Serializable;

public class InterpreterBean <T extends , List<? extends IntrepretBean>> implements Serializable {
    Long id;
    
    static Long MaxLen=100l; 
	T value;
    java.util.List<InterpreterBean> interpreters;
    
    public InterpreterBean() {}
    
  
    public T getFinalValue(Long mx) {
      T fv = null;
      if(mx>MaxLen)
    	  mx = MaxLen;
      fv = this.interpret();
     
      for(InterpreterBean ib: this.interpreters) {
    	  fv = this.add((T)ib.getFinalValue( mx--));
      }
      	return fv;
    }
    
    public T interpret( ) {
    	return null;
    }


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public T getValue() {
		return value;
	}


	public void setValue(T value) {
		this.value = value;
	}


	public java.util.List<?> getInterpreters() {
		return interpreters;
	}


	public void setInterpreters(java.util.List<InterpreterBean> interpreters) {
		this.interpreters = interpreters;
	}



	T add(T f) {
		return null;
	}

}
