package com.res.emorobots.command;

import java.util.Collection;

public interface Preparable <T extends Collection<?>>{
	
	public T initalize(T d);
	
	public T finalize(T d);

}
