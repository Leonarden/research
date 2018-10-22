package com.res.emorobots.observer;

import java.util.Collection;

public class Observer<T extends Collection<?>> {
	protected long id;
	protected T data;

	
public T update(T d) {
	return null;
}


public long getId() {
	return id;
}


public void setId(long id) {
	this.id = id;
}


public T getData() {
	return data;
}


public void setData(T data) {
	this.data = data;
}
	

}
