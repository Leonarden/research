package com.res.memento;

public class MilleTracker<Double> {

	private State<Double> state = new State<Double>();
	public MilleTrackerMemento createMemento() {
		return new MilleTrackerMemento();
	}
	public MilleTrackerMemento setMemento(MilleTrackerMemento mt){
		
	
	}
	// Intend of walking one step
		Double go() {
			Double d = Double.valueOf(Math.random() % 0.85);
			if(d<0.5) d= 0.5;
			return d;
		}
		
		public Double forward(){
			return this.go();
		}
		
		public Double backward() {
		Double d = new Double(-1) * this.go();	
         return( 	   		
			
		}

		public void walk(int step, int diff){
			if( step % diff == 0)
			state.add(this.forward());
			else
				state.add(this.backward());
		}



}
