package com.res.memento;

public class MilleTrackerMemento<T> {
private State<T> state;

public State<T> getState() {
	return state;
}

public void setState(State<T> s) {
	state = s;
}

}
