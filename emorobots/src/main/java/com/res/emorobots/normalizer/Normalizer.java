package com.res.emorobots.normalizer;

import java.util.Collection;
import java.util.List;

import com.res.emorobots.stat.adapter.ModelAdapter;

public class Normalizer<T extends Collection<?>>{
T data;
ModelAdapter<T> statModel;
public Normalizer() {}
public Normalizer(T d, ModelAdapter<T> smodel) {
	this.data = d;
	this.statModel = smodel;
}

	public T normalize() {
		return null;
	}

	public T globalNormalize( List<T> datalist) {
		return null;
	}
}

