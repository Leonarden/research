package com.res.emorobots.activity.command;

import java.util.Collection;

public interface Executable<T extends Collection<?>> {

	public T execute();
	
}
