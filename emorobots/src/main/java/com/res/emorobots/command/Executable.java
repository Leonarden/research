package com.res.emorobots.command;

import java.util.Collection;

public interface Executable<T extends Collection<?>> {

	public T execute();
	
}
