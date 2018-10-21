package com.res.emorobots.observer;

public interface Callback<T> {

	public void callback();
	public T callback(T o);
}
