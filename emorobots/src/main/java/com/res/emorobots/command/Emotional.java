package com.res.emorobots.command;

import java.util.Collection;

public interface Emotional<T extends Collection<?>> {
// need to take into account statistical model
public T initalize(T d);
public T normalize(T d);
public T finalize(T d);
	
}
