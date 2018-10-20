package com.res.emorobots;

public interface Callback<T> {

	public void callback();
	public T callback(T o);
}
