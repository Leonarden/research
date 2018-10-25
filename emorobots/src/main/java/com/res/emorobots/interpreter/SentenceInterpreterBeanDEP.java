package com.res.emorobots.interpreter;

public class SentenceInterpreterBeanDEP extends InterpreterBean<String,SentenceInterpreterBean> {
	

    public String getFinalValue(Long mx) {
      String fv = null;
      if(mx>MaxLen)
    	  mx = MaxLen;
      fv = this.interpret();
     
      for(InterpreterBean ib: this.interpreters) {
    	  if(ib instanceof WordInterpreterBean<String,List<Senten>> || ib instanceOf Symbol)
    		  fv = this.add(String)ib.getValue());
      }
      	return fv;
    }
    
    public String interpret( ) {
    	return null;
    }

	
	
	String add(String s) {
		this.value = this.value + s;
		return this.value;
	}

}
