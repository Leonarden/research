package com.res.emorobots.command;

public class Action<T> {
T data;
	public T preprocess(T d) {
		return null;
	}
	public T process(T d) {
		return null;
	}

	public T postprocess(T d) {
		return null;
	}

}
