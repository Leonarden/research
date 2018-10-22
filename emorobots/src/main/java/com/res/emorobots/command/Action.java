package com.res.emorobots.command;

import java.util.Collection;

public class Action<T extends Collection<?>> {
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
