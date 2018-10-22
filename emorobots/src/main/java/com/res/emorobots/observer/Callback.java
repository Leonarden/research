package com.res.emorobots.observer;

import java.util.Collection;

public interface Callback<T extends Collection<?>> {

	public void callback();
	public T callback(T o);
	
}
