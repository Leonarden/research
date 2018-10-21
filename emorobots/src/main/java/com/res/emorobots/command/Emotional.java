package com.res.emorobots.command;

public interface Emotional<T> {
// need to take into account statistical model
public T initalize(T d);
public T normalize(T d);
public T finalize(T d);
	
}
