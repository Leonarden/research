package com.res.emorobots.normalizer;

import java.util.List;

import com.res.emorobots.statmodel.EmotionModel;

public class Normalizer<T>{
T data;
EmotionModel<T> statModel;
public Normalizer() {}
public Normalizer(T d, EmotionModel<T> smodel) {
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

